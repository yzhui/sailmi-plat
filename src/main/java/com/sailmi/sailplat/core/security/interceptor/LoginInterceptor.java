package com.sailmi.sailplat.core.security.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sailmi.sailplat.core.security.support.SecurityUserHolder;
import com.sailmi.sailplat.foundation.domain.User;

public class LoginInterceptor extends HandlerInterceptorAdapter   {
	 @Override
	    public boolean preHandle(HttpServletRequest request,
	            HttpServletResponse response, Object handler) throws Exception {
	        System.out.println("==>>Begin to Filter session====");
	        HttpSession session = request.getSession();
	        User user = SecurityUserHolder.getCurrentUser();
	        if(user!=null){
		        System.out.println("===>>Current User=="+user.getUserName());
	        }
	        String curPath=request.getRequestURL().toString();
	        System.out.println("===>> curpath:"+curPath);
	        if(null==user){
	        	if(curPath.indexOf("/admin/")>0){
		            /**
		             * handle session and security if you want.
		             */
		            request.getRequestDispatcher("/admin/login.htm").forward(request, response);
	        	}else{
		            /**
		             * handle session and security if you want.
		             */
		            request.getRequestDispatcher("/user/login.htm").forward(request, response);
	        	}
	        }        
	        return super.preHandle(request, response, handler);
	    }
}
