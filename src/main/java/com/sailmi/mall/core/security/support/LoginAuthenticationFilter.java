 package com.sailmi.mall.core.security.support;
 
 import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.RequestMatcher;

import com.sailmi.mall.core.tools.CommUtil;
import com.sailmi.mall.foundation.service.ISysConfigService;
import com.sailmi.mall.uc.api.UCClient;
import com.sailmi.mall.uc.api.XMLHelper;
 
 public class LoginAuthenticationFilter extends UsernamePasswordAuthenticationFilter
 {
 
	 @Autowired
	   private ISysConfigService configService;

	 protected LoginAuthenticationFilter() {
		 super();
		// TODO Auto-generated constructor stub
	}

 
 
   
   private static String uc_Login(String username, String pws) {
     String ucsynlogin = "";
     UCClient e = new UCClient();
     String result = e.uc_user_login(username, pws);
     LinkedList rs = XMLHelper.uc_unserialize(result);
     if (rs.size() > 0) {
       int uid = Integer.parseInt((String)rs.get(0));
       String uname = (String)rs.get(1);
       String password = (String)rs.get(2);
       String email = (String)rs.get(3);
       if (uid > 0)
       {
         ucsynlogin = e.uc_user_synlogin(uid);
       }
       else if (uid == -1) {
         System.out.println("用户不存在,或者被删除");
       }
 
     }
 
     return ucsynlogin;
   }

@Override
public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
		throws AuthenticationException {
	// TODO Auto-generated method stub
    String login_role = request.getParameter("login_role");
    //CommUtil.null2String(request.getSession(false).getAttribute("smmall_view_type"))
    String smmall_view_type = CommUtil.null2String(request.getSession(false).getAttribute("smmall_view_type"));
    if ((login_role == null) || (login_role.equals("")))
      login_role = "user";
    HttpSession session = request.getSession();
    session.setAttribute("login_role", login_role);
    session.setAttribute("ajax_login", 
      Boolean.valueOf(CommUtil.null2Boolean(request.getParameter("ajax_login"))));
    session.setAttribute("smmall_view_type", smmall_view_type);
    boolean flag = true;
    if (session.getAttribute("verify_code") != null) {
      String code = request.getParameter("code") != null ? request.getParameter("code").toUpperCase() : "";
      if (!session.getAttribute("verify_code").equals(code)) {
        flag = false;
      }
    }
    if (!flag) {
		String username = obtainUsername(request);
		String password = "";
		username = username.trim();
		UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
				username, password);
		if ((session != null) || (getAllowSessionCreation())) {
			request.getSession().setAttribute(
					"SPRING_SECURITY_LAST_USERNAME",
					StringUtils.escape(username));
		}
		setDetails(request, authRequest);
		return getAuthenticationManager().authenticate(authRequest);
	}
	String username = "";
	if (CommUtil.null2Boolean(request.getParameter("encode"))) {
//		try {
//			username = new String(request.getParameter("username")
//					.getBytes("ISO_8859-1"), "UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		username=request.getParameter("username");
		username += "," + login_role;
		// username = CommUtil.decode(obtainUsername(request)) + "," +
		// login_role;
	} else {
		username = obtainUsername(request) + "," + login_role;
	}
	String password = obtainPassword(request);
	System.out.println("User "+username + "Logined with pass "+password+" View Type:"+smmall_view_type);

	if (this.configService.getSysConfig().isUc_bbs()) {
		String uc_login_js = uc_Login(
				CommUtil.decode(obtainUsername(request)), password);
		request.getSession(false).setAttribute("uc_login_js", uc_login_js);
	}
	username = username.trim();
	UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
			username, password);
	System.out.println("auth request is:"+authRequest.isAuthenticated());
	System.out.println("auth request is:"+authRequest.getName());
	System.out.println("auth request is:"+authRequest.getPrincipal());
	System.out.println("auth request is:"+authRequest.getAuthorities());

	if ((session != null) || (getAllowSessionCreation())) {
		request.getSession().setAttribute("SPRING_SECURITY_LAST_USERNAME",
				StringUtils.escape(username));
	}
	setDetails(request, authRequest);
	return getAuthenticationManager().authenticate(authRequest);}
 }
