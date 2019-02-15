package com.sailmi.sailplat.core.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * Created by yfyuan on 2017/3/16.
 */
public class ShareAuthenticationProviderDecorator implements AuthenticationProvider {

    private AuthenticationProvider authenticationProvider;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    	System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        if (authentication instanceof ShareAuthenticationToken) {
        	System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
            return authentication;
        } else {
        	Authentication userAuthen=authenticationProvider.authenticate(authentication);
        	System.out.println("mmmmmmmmmmmmmmmmmmnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"+userAuthen.getClass().getName());
        	System.out.println("kkkkkkkkkkkkkkkkkk:"+userAuthen.getAuthorities());
            return userAuthen;
        }
    }

    @Override
    public boolean supports(Class<?> aClass) {
        if (aClass.equals(ShareAuthenticationToken.class)) {
        	System.out.println("1uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
            return true;
        } else {
        	System.out.println("2uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
            return authenticationProvider.supports(aClass);
        }
    }

    public void setAuthenticationProvider(AuthenticationProvider authenticationProvider) {
        this.authenticationProvider = authenticationProvider;
    }

	public AuthenticationProvider getAuthenticationProvider() {
		return authenticationProvider;
	}
    
}
