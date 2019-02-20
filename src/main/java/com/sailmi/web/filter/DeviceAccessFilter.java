package com.sailmi.web.filter;

import java.io.File;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sailmi.sailplat.foundation.domain.SysConfig;
import com.sailmi.sailplat.foundation.domain.User;
import com.sailmi.sailplat.foundation.service.ISysConfigService;
import com.sailmi.sailplat.security.support.SecurityUserHolder;
import com.sailmi.tools.CommUtil;
import com.sailmi.tools.MobileCheckUtil;

@Component
public class DeviceAccessFilter implements Filter {

	@Autowired
	private ISysConfigService configService;

	public void destroy() {
	}

	public void doFilter( ServletRequest req, ServletResponse res, FilterChain chain ) throws IOException, ServletException {
		System.out.println("DeviceAccessFilter:0.......................................................................");
		SysConfig config = this.configService.getSysConfig();
		HttpServletResponse response = (HttpServletResponse)res;
		HttpServletRequest request = (HttpServletRequest)req;
		System.out.println(this.getClass().getName()+":request string:"+req.getAttributeNames());
		boolean isMobile=false;
		if(MobileCheckUtil.check(request.getHeader("USER-AGENT"))){
			isMobile=true;
		}
		String url = request.getRequestURI();
		boolean redirect = false;
		String redirect_url = "";
		//如果检测为移动端，那么跳转到移动端页面
		System.out.println("10----------------------------------------------------------------------------------"+redirect_url);
		if(isMobile&&url.indexOf("/m/")>0) {
			String hostRoot=url.substring(0,url.lastIndexOf("/",8));//截取第一个"/"号之前的字符串
			redirect_url = url.replaceAll(hostRoot,hostRoot+ "m/");
		}
		if( redirect )
			response.sendRedirect( redirect_url );
		else
			chain.doFilter( req, res );
	}

	public void init( FilterConfig config ) throws ServletException {
	}

	private boolean init_url( String url ) {
		String prifix = "";
		if( url.indexOf( "." ) > 0 )
			prifix = url.substring( url.lastIndexOf( "." ) + 1 );
		else {
			prifix = url;
		}
		String[] extend_list = { "css", "jpg", "jpeg", "png", "gif", "bmp", "js" };
		String[] servlet_list = { "/image/upload" };
		boolean flag = true;
		for( String temp : extend_list ) {
			if( temp.equals( prifix ) ) {
				flag = false;
			}
		}
		for( String temp : servlet_list ) {
			if( prifix.indexOf( temp ) >= 0 ) {
				flag = false;
			}
		}

		return flag;
	}
}