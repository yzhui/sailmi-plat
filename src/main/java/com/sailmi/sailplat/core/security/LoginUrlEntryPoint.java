package com.sailmi.sailplat.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class LoginUrlEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + ".....................................................");

		String targetUrl = null;
		String url = request.getRequestURI();
		if ((request.getQueryString() != null) && (!request.getQueryString().equals(""))) {
			url = url + "?" + request.getQueryString();
		}
		request.getSession(false).setAttribute("refererUrl", url);

		if (url.indexOf("/admin/") >= 0)
			targetUrl = request.getContextPath() + "/admin/login.htm";
		else {
			targetUrl = request.getContextPath() + "/user/login.htm";
		}
		response.sendRedirect(targetUrl);

	}
}
