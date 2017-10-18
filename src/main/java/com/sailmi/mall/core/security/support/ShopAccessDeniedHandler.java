 package com.sailmi.mall.core.security.support;
 
 import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import com.sailmi.mall.foundation.domain.User;
 
 public class ShopAccessDeniedHandler extends SimpleUrlAuthenticationFailureHandler
   implements AccessDeniedHandler
 {
   public static final String SPRING_SECURITY_ACCESS_DENIED_EXCEPTION_KEY = "SPRING_SECURITY_403_EXCEPTION";
   protected static final Log logger = LogFactory.getLog(AccessDeniedHandlerImpl.class);
   private String errorPage;
   
   public ShopAccessDeniedHandler(String errorPage) {
	super();
	this.errorPage = errorPage;
}



@Override
public void handle(HttpServletRequest request, HttpServletResponse response,
		AccessDeniedException accessDeniedException) throws IOException, ServletException {
	// TODO Auto-generated method stub
    if(this.errorPage==null) this.errorPage = "/authority.htm";
    User user = SecurityUserHolder.getCurrentUser();
    GrantedAuthority[] all_authorities = user.get_all_Authorities();
    Authentication auth = SecurityContextHolder.getContext()
      .getAuthentication();
    Collection current_authorities = auth.getAuthorities();
    System.out.println("erro page is:"+this.errorPage);
    System.out.println("user role is:"+user.getUserRole());
    System.out.println("authorities is:"+current_authorities);
    System.out.println("authorities size is:"+current_authorities.size());
    System.out.println("authorities all is:"+all_authorities);
    if (user.getUserRole().indexOf("ADMIN") < 0) {
      this.errorPage = "/buyer/authority.htm";
    }
    else if (all_authorities.length != current_authorities.size()) {
      this.errorPage = "/admin/login.htm";
    }

    if (this.errorPage != null) {
      ((HttpServletRequest)request).setAttribute(
        "SPRING_SECURITY_403_EXCEPTION", accessDeniedException);

      RequestDispatcher rd = request.getRequestDispatcher(this.errorPage);
      rd.forward(request, response);
    }

    if (!response.isCommitted())
      ((HttpServletResponse)response).sendError(403, 
        accessDeniedException.getMessage());
  }

  public void setErrorPage(String errorPage)
  {
    if ((errorPage != null) && (!errorPage.startsWith("/"))) {
      throw new IllegalArgumentException("errorPage must begin with '/'");
    }

    this.errorPage = errorPage;
	
}
 }
