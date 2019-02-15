package com.sailmi.sailplat.core.security;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sailmi.sailplat.foundation.domain.User;
import com.sailmi.sailplat.foundation.service.IUserService;
import com.sailmi.sailplat.foundation.service.impl.UserServiceImpl;

/**
 * Created by yfyuan on 2016/12/14.
 */
public class DbUserDetailService extends JdbcDaoImpl {
	@Autowired
	private IUserService userService;
	private String userAddSql;
	private String userRoleAddSql;
	private String userInfoUrl;
	private String userTokenUrl;
	private String authoritiesByUsernameQuery;
	private boolean enableAuthorities = true;
	private boolean enableGroups;

	
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public boolean isEnableAuthorities() {
		return enableAuthorities;
	}

	public void setEnableAuthorities(boolean enableAuthorities) {
		super.setEnableAuthorities(enableAuthorities);
		this.enableAuthorities = enableAuthorities;
	}

	public boolean isEnableGroups() {
		return enableGroups;
	}

	public void setEnableGroups(boolean enableGroups) {
		super.setEnableGroups(enableGroups);
		this.enableGroups = enableGroups;
	}

	public String getUserTokenUrl() {
		return userTokenUrl;
	}

	public String getAuthoritiesByUsernameQuery() {
		return authoritiesByUsernameQuery;
	}


	public void setUserTokenUrl(String userTokenUrl) {
		this.userTokenUrl = userTokenUrl;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
    	//获取此用户在报表系统中的信息，如果没有信息，则新建用户
		System.out.println("Get User Info From DB:"+username);
		if(username==null) return null;
		User tempUser =  userService.getObjByProperty("userName",username);
		tempUser.setAuthorities(this.loadUserAuthorities(username));
		return tempUser;
	}

	public User getUserInfoByToken(String token){
		String uInfoUrl= this.userTokenUrl+"&accesstoken="+token;
    	String jsonInfo=getJsonContent(uInfoUrl);
    	JSONObject uObject=JSON.parseObject(jsonInfo);
    	if(uObject.getInteger("statuscode")==1){
    		User user=new User();
    		JSONObject dObject=uObject.getJSONObject("data");
    		String tid=dObject.getString("teamId");
    		String rName=dObject.getString("realName");
    		String uid=dObject.getString("userId");
    		if(user.getUserCode()==null){
    			user.setUserCode(uid);
    		}
    		return user;
    	}
		return null;
	}
	
	public User initUserInfo(User user){
    	//初始化用户信息
    	String uInfoUrl = userInfoUrl+"&userName="+user.getUsername();
    	String jsonInfo=getJsonContent(uInfoUrl);
    	System.out.println("Get User Info From:"+uInfoUrl);
    	System.out.println("Get User Info:"+jsonInfo);
    	//清除缓存
    	JSONObject uObject=JSON.parseObject(jsonInfo);
    	if(uObject.getInteger("statuscode")==1){
    		JSONObject dObject=uObject.getJSONObject("data");
    		String tid=dObject.getString("teamId");
    		String rName=dObject.getString("realName");
    		String uid=dObject.getString("userId");
    		if(user.getUserCode()==null){
    			user.setUserCode(uid);
    		}
    	}
    	return user;
	}
    
    public String getUserInfoUrl() {
		return userInfoUrl;
	}

	public void setUserInfoUrl(String userInfoUrl) {
		this.userInfoUrl = userInfoUrl;
	}

	
	
	//获取服务器json字符串
    public static String getJsonContent(String urlStr)
    {
        try
        {// 获取HttpURLConnection连接对象
            URL url = new URL(urlStr);
            HttpURLConnection httpConn = (HttpURLConnection) url
                    .openConnection();
            // 设置连接属性
            httpConn.setConnectTimeout(3000);
            httpConn.setDoInput(true);
            httpConn.setRequestMethod("GET");
            httpConn.setRequestProperty("contentType", "UTF-8");  
            // 获取相应码
            int respCode = httpConn.getResponseCode();
            if (respCode == 200)
            {
            	InputStream inStream = httpConn.getInputStream();  
                BufferedReader in = new BufferedReader(new InputStreamReader(inStream, "UTF-8"));  
                StringBuffer buffer = new StringBuffer();  
                String line = "";  
                while ((line = in.readLine()) != null){  
                  buffer.append(line);  
                }  
                return buffer.toString();
            }
        }
        catch (MalformedURLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    }

    

    /**
     * 
     * @param username
     * @return
     */
    public boolean addUser(User user){
    	boolean succ=false;
    	//String userCode=UUID.randomUUID().toString();
    	//user.setUserCode(userCode);
    	User rUser=initUserInfo(user);
        user.setUserRole("BUYER_SELLER,BUYER,SELLER");
        user.setPassword(this.getRandomString(15));
        user.setDeleteStatus(false);
        user.setGold(0);
        user.setIntegral(0);
        user.setLoginCount(0);
        user.setReport(0);
        user.setSex(0);
        user.setStatus(0);
        userService.save(rUser);
    	return succ;
    }
    
    public static String getRandomString(int length) { //length表示生成字符串的长度    
        String base = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*-";       
        Random random = new Random();       
        StringBuffer sb = new StringBuffer();       
        for (int i = 0; i < length; i++) {       
            int number = random.nextInt(base.length());       
            sb.append(base.charAt(number));       
        }       
        return sb.toString();       
     }  
    
    @Override
	public void setUsersByUsernameQuery(String usersByUsernameQueryString) {
		// TODO Auto-generated method stub
		super.setUsersByUsernameQuery(usersByUsernameQueryString);
	}


	private List getUserListByJdbc(String username){
    	System.out.println("Get User By JDBC:"+username);
    	System.out.println("Get User By JDBC:"+super.getUsersByUsernameQuery());
    	return this.getJdbcTemplate().query(getUsersByUsernameQuery(), new String[]{username}, new RowMapper() {
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                Long userId = rs.getLong(1);
                String username = rs.getString(2);
                String userCode = rs.getString(3);
                String password = rs.getString(4);
                boolean enabled = rs.getBoolean(5);
                System.out.println("user code is:"+userCode);
                System.out.println("user Name is:"+username);
                System.out.println("User password is:"+password);
                User user = new User();
                user.setId(userId);
                user.setUserCode(userCode);
                user.setUserName(username);
                user.setPassword(password);
                User rUser=initUserInfo(user);
                return rUser;
            }
        });
    }

	public String getUserAddSql() {
		return userAddSql;
	}

	public void setUserAddSql(String userAddSql) {
		this.userAddSql = userAddSql;
	}

	public String getUserRoleAddSql() {
		return userRoleAddSql;
	}

	public void setUserRoleAddSql(String userRoleAddSql) {
		this.userRoleAddSql = userRoleAddSql;
	}

}
