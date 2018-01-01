 package com.sailmi.mall.core.security.support;
 
 import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sailmi.mall.core.security.SecurityManager;
import com.sailmi.mall.foundation.domain.Res;
import com.sailmi.mall.foundation.domain.Role;
import com.sailmi.mall.foundation.service.IResService;
 
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
    	 List roleAuthorities = new ArrayList();
    	 List<Role> roleList=res.getRoles();
         for (Role role : roleList) {
           roleAuthorities.add(role.getRoleCode());
         }
         String roleStr = StringUtils.join(roleAuthorities.toArray(), ",");
       urlAuthorities.put(res.getValue(),roleStr);
     }
     return urlAuthorities;
   }
 }
