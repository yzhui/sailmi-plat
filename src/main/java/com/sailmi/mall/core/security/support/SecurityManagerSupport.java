 package com.sailmi.mall.core.security.support;
 
 import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sailmi.mall.core.security.SecurityManager;
import com.sailmi.mall.foundation.domain.Res;
import com.sailmi.mall.foundation.domain.Role;
import com.sailmi.mall.foundation.domain.User;
import com.sailmi.mall.foundation.service.IResService;
import com.sailmi.mall.foundation.service.IUserService;
 
 public class SecurityManagerSupport
   implements  SecurityManager
 {
 
 
   @Autowired
   private IResService resService;
 
 
   public Map<String, String> loadUrlAuthorities()
   {
     Map<String, String> urlAuthorities = new HashMap<String, String>();
     Map<String, String> params = new HashMap<String, String>();
     params.put("type", "URL");
     List<Res> urlResources = this.resService.query(
       "select obj from Res obj where obj.type = :type", params, -1, 
       -1);
     for (Res res : urlResources) {
       urlAuthorities.put(res.getValue(), res.getRoleAuthorities());
     }
     return urlAuthorities;
   }
 }
