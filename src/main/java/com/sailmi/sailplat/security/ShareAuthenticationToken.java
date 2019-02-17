package com.sailmi.sailplat.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;

import com.sailmi.sailplat.foundation.domain.User;

/**
 * Created by yfyuan on 2017/3/16.
 */
public class ShareAuthenticationToken extends AbstractAuthenticationToken {

    private User user;

    public ShareAuthenticationToken(User user) {
        super(AuthorityUtils.NO_AUTHORITIES);
        this.user = user;
    }


    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return user;
    }
}
