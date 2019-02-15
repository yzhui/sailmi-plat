 package com.sailmi.sailplat.core.security.support;
 
 import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;
import java.util.HashMap;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.util.Assert;

import com.alibaba.fastjson.JSONObject;
import com.sailmi.sailplat.core.tools.DefautX509TrustManager;
import com.sailmi.sailplat.core.tools.Md5Encrypt;
import com.sailmi.sailplat.core.tools.SSLClientUtil;
import com.sailmi.sailplat.foundation.domain.User;
import com.sailmi.sailplat.foundation.service.ISysConfigService;
import com.sailmi.sailplat.foundation.service.IUserService;
 
 public class ShopAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider
 {
   @Autowired
   private ISysConfigService configService;
   @Autowired
   private IUserService userService;
   
   private PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
   private SaltSource saltSource;
   private UserDetailsService userDetailsService;
   private boolean includeDetailsObject = true;
 
   protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication)
     throws AuthenticationException
   {
	 System.out.println("Now Authen User:"+userDetails.getUsername());
     Object salt = null;
     if (this.saltSource != null) {
       salt = this.saltSource.getSalt(userDetails);
     }
     if (authentication.getCredentials() == null) {
       throw new BadCredentialsException(this.messages.getMessage(
         "AbstractUserDetailsAuthenticationProvider.badCredentials", 
         "Bad credentials"));
     }
     String presentedPassword = authentication.getCredentials().toString();
     System.out.println("@111111111111111111111111111111111111111111");
     if (presentedPassword.indexOf("sailmall_thid_login_") >= 0) {
         System.out.println("@2111111111111111111111111111111111111111111");
       presentedPassword = presentedPassword
         .substring("sailmall_thid_login_".length());
    	     System.out.println("@6111111111111111111111111111111111111111111");
           if (!presentedPassword.equals(userDetails.getPassword())) {
               throw new BadCredentialsException(
                 this.messages.getMessage(
                 "AbstractUserDetailsAuthenticationProvider.badCredentials", 
                 "Bad credentials"));
             }
 
     }
     else if (!this.passwordEncoder.isPasswordValid(
       userDetails.getPassword(), presentedPassword, salt)) {
         System.out.println("@7111111111111111111111111111111111111111111");
       throw new BadCredentialsException(
         this.messages.getMessage(
         "AbstractUserDetailsAuthenticationProvider.badCredentials", 
         "Bad credentials"));
     }
   }
 
   protected void doAfterPropertiesSet() throws Exception {
     Assert.notNull(this.userDetailsService, 
       "A UserDetailsService must be set");
   }
 
   
   /**
    * 远程认证
    * @param userName
    * @param userPass
    * @return
    */
   private boolean authenByRestUrl(String userName,String userPass){
	   try
       {// 获取HttpURLConnection连接对象
           String loginUrl=this.configService.getSecurityAuthType().getLoginUrl();
           String post="userName="+userName+"&password="+userPass;
           System.out.println("Remote Rest Url is:"+loginUrl);
           System.out.println("Post Parameter is:"+post);
           HashMap paraMap=new HashMap<String, String>();
           paraMap.put("username",userName);
           userPass=userName+","+userPass;
           paraMap.put("password",userPass);
           SSLClientUtil sslUtil=new SSLClientUtil();
           String res=sslUtil.doPost(loginUrl, paraMap, "UTF-8");
           //获取cas-tgt
           if(res.indexOf("201")>0&&res.indexOf("TGT-")>0) return true;
           System.out.println("Response:"+res);
           return false;
       }
       catch (Exception e)
       {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
	   return false;
   }
   
   protected final UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
     throws AuthenticationException
   {
	 System.out.println("Start RetrieveUser:"+username);
	 System.out.println("Authen Name:"+authentication.getName());
	 System.out.println("Authen Principal:"+authentication.getPrincipal());
	 System.out.println("Authen Credentials:"+authentication.getCredentials());
	 System.out.println("Authen Details:"+authentication.getDetails());
     String userAccount=username.substring(0,username.indexOf(','));
	   String userPassEncrypted=Md5Encrypt.md5((String)authentication.getCredentials());
	 if(this.configService.getSecurityAuthType().getAuthType().equals("rest")){
       System.out.println("#@4111111111111111111111111111111111111111111"+authentication.getDetails().getClass().getName());
		 
	   //UserDetails tempUser=(User)authentication.getPrincipal();
       System.out.println("$@4111111111111111111111111111111111111111111");
       boolean isAuthened=authenByRestUrl(userAccount,(String)authentication.getCredentials());
	   
       System.out.println("^@4111111111111111111111111111111111111111111");
	   if(isAuthened){//认证通过
		   User tempUser=new User();
		   //要把此用户添加到系统当中
		       System.out.println("@4111111111111111111111111111111111111111111");
		   User dbUser=(User)this.userDetailsService.loadUserByUsername(userAccount);
		   if(dbUser==null){
			   User tUser=new User();
			   tUser.setUserRole("BUYER_SELLER,BUYER,SELLER");
			   tUser.setPassword(userPassEncrypted);
			   tUser.setDeleteStatus(false);
			   tUser.setGold(0);
			   tUser.setIntegral(0);
			   tUser.setLoginCount(0);
			   tUser.setReport(0);
			   tUser.setSex(0);
			   tUser.setStatus(0);
			   userService.save(tUser);  
		   }else{
			   dbUser.setPassword(userPassEncrypted);
			   userService.update(dbUser);
		   } 
		   authentication.setDetails(dbUser);
	   }else{//认证不通过
		      System.out.println("@5111111111111111111111111111111111111111111");
         throw new BadCredentialsException(
                 this.messages.getMessage(
                 "AbstractUserDetailsAuthenticationProvider.badCredentials", 
                 "Bad credentials"));
	   }
	 }
	 UserDetails loadedUser;
     //默认从数据库中获取用户
	 try
     {
       loadedUser = getUserDetailsService().loadUserByUsername(userAccount);
       System.out.println("User Detail Service Is:"+this.getUserDetailsService().getClass().getName());
       System.out.println("User Detail Is:"+loadedUser);
     }
     catch (DataAccessException repositoryProblem)
     {
       System.out.println("Authen Token Exception:"+repositoryProblem.getMessage());
       throw new AuthenticationServiceException(
         repositoryProblem.getMessage(), repositoryProblem);
     }
     
     if (loadedUser == null) {
       System.out.println("11111111111111111111111111111111111sdddddddddddddd");
       throw new AuthenticationServiceException(
         "UserDetailsService returned null, which is an interface contract violation");
     }
     System.out.println("User Detail Is:"+loadedUser.getUsername());
     return loadedUser;
   }
 
   public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
     this.passwordEncoder = passwordEncoder;
   }
 
   protected PasswordEncoder getPasswordEncoder() {
     return this.passwordEncoder;
   }
 
   public void setSaltSource(SaltSource saltSource) {
     this.saltSource = saltSource;
   }
 
   protected SaltSource getSaltSource() {
     return this.saltSource;
   }
 
   public void setUserDetailsService(UserDetailsService userDetailsService) {
     this.userDetailsService = userDetailsService;
   }
 
   protected UserDetailsService getUserDetailsService() {
     return this.userDetailsService;
   }
 
   protected boolean isIncludeDetailsObject() {
     return this.includeDetailsObject;
   }
 
   public void setIncludeDetailsObject(boolean includeDetailsObject)
   {
     this.includeDetailsObject = includeDetailsObject;
   }
 }

