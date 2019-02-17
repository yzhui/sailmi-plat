package com.sailmi.sailplat.security;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jasig.cas.client.proxy.ProxyGrantingTicketStorage;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.cas.web.CasAuthenticationFilter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.util.matcher.RequestMatcher;

import com.sailmi.sailplat.foundation.domain.User;

public class TokenOrCasAuthenticationFilter extends CasAuthenticationFilter{
	private DbUserDetailService userDetailService;
	private RequestMatcher proxyReceptorMatcher;
	private ProxyGrantingTicketStorage proxyGrantingTicketStorage;

	@Override
	public Authentication attemptAuthentication(final HttpServletRequest request,
			final HttpServletResponse response) throws AuthenticationException,
			IOException {
		String token = request.getParameter("accesstoken");
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz token is:"+token);
		Authentication userAuthen=null;
		if(request.getSession().getAttribute("login_user_authen")!=null){
			userAuthen=(Authentication)request.getSession().getAttribute("login_user_authen");
		}else{
			if(token!=null){
					//执行自动登录
					User loginUser = null;
				loginUser=userDetailService.getUserInfoByToken(token);
				if(loginUser!=null){
					String username = loginUser.getUserName();
					String password = loginUser.getPassword();
					if (password == null) {
						logger.debug("Failed to obtain an artifact (cas ticket)");
						password = "";
					}
					final UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
							username, password);
					authRequest.setDetails(authenticationDetailsSource.buildDetails(request));
					userAuthen= this.getAuthenticationManager().authenticate(authRequest);
				}
			}else{
				System.out.println("zzzzzzzzzz-------------------------------------");
				userAuthen=super.attemptAuthentication(request, response);
				System.out.println(userAuthen.getAuthorities());
			}
			request.getSession().putValue("login_user_authen",userAuthen);
		}
		return userAuthen;
	}
	

	public DbUserDetailService getUserDetailService() {
		return userDetailService;
	}

	public void setUserDetailService(DbUserDetailService userDetailService) {
		this.userDetailService = userDetailService;
	}
	
}
