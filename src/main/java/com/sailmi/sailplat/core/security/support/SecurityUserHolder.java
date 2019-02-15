 package com.sailmi.sailplat.core.security.support;
 
 import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sailmi.sailplat.core.tools.CommUtil;
import com.sailmi.sailplat.foundation.domain.User;
 
 public class SecurityUserHolder
 {
   public static User getCurrentUser()
   {
     User user = null;
     if (SecurityContextHolder.getContext().getAuthentication() != null)
     {
       if ((SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails))
       {
    	 user=(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	 System.out.println("SecurityUserHolder1:"+user);
       }
     }else{
         if (RequestContextHolder.getRequestAttributes() != null) {
           HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
           HttpSession  session = request.getSession(false);
           if(session!=null)
        	   user = session.getAttribute("user") != null ?(User)session.getAttribute("user") : null;
         }
         System.out.println("SecurityUserHolder2:"+user);
     }
     System.out.println("SecurityUserHolder3:"+user);
     return user;
   }
 }

