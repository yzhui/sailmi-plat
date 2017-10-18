package com.sailmi.mall.core.security;

import com.sailmi.mall.foundation.domain.User;

/**
 * Created by yfyuan on 2016/9/29.
 */
public interface AuthenticationService {

    User getCurrentUser();
}
