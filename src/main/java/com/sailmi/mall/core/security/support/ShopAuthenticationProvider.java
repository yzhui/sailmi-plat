 package com.sailmi.mall.core.security.support;
 
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
 
 public class ShopAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider
 {
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
     if (presentedPassword.indexOf("smmall_thid_login_") >= 0) {
       presentedPassword = presentedPassword
         .substring("smmall_thid_login_".length());
       if (!presentedPassword.equals(userDetails.getPassword())) {
         throw new BadCredentialsException(
           this.messages.getMessage(
           "AbstractUserDetailsAuthenticationProvider.badCredentials", 
           "Bad credentials"));
       }
 
     }
     else if (!this.passwordEncoder.isPasswordValid(
       userDetails.getPassword(), presentedPassword, salt)) {
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
 
   protected final UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
     throws AuthenticationException
   {
	 System.out.println("Start RetrieveUser:"+username);
	 System.out.println("Authen Token:"+authentication.getName());
	 UserDetails loadedUser;
     try
     {
       loadedUser = getUserDetailsService().loadUserByUsername(username);
       System.out.println("User Detail Service Is:"+this.getUserDetailsService().getClass().getName());
       System.out.println("User Detail Is:"+loadedUser);
     }
     catch (DataAccessException repositoryProblem)
     {
       throw new AuthenticationServiceException(
         repositoryProblem.getMessage(), repositoryProblem);
     }
     
     if (loadedUser == null) {
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

