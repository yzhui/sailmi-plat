 package com.sailmi.mall.core.security.interceptor;
 
 import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

public class SecureResourceFilterInvocationDefinitionSource
  implements FilterInvocationSecurityMetadataSource, InitializingBean
{

  private boolean lowercaseComparisons = true;
	@Override
	public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
	    FilterInvocation filterInvocation = (FilterInvocation)object;
	    String requestURI = filterInvocation.getRequestUrl();
	    boolean verify = true;
    
	    ArrayList attrList=new ArrayList();
        
	    if ((verify) && (requestURI.indexOf("login.htm") < 0)) {
	      Map urlAuthorities = 
	        getUrlAuthorities(filterInvocation);
	      String grantedAuthorities = null;
	
	      Iterator iter = urlAuthorities.entrySet().iterator();
	      while (iter.hasNext()) {
	        Map.Entry entry = (Map.Entry)iter.next();
	        String url = (String)entry.getKey();
	        if(url!=null){
	        	RequestMatcher requestMatcher = new AntPathRequestMatcher(url);
		        if(requestMatcher.matches(filterInvocation.getHttpRequest())){
                    //以权限名封装为Spring的security Object
					ConfigAttribute configAttribute = new SecurityConfig((String)entry.getValue());
					attrList.add(configAttribute);
		        }
	        }
	      }
	    }
    	return attrList;
	}
	
	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	private Map<String, String> getUrlAuthorities(FilterInvocation filterInvocation)
	{
	  ServletContext servletContext = filterInvocation.getHttpRequest()
	    .getSession().getServletContext();
	  return (Map)servletContext
	    .getAttribute("urlAuthorities");
	}
}

