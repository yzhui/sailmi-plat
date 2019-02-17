 package com.sailmi.sailplat.mall.view.web.tools;
 
 import com.sailmi.sailplat.foundation.domain.Navigation;
import com.sailmi.sailplat.foundation.service.IActivityService;
import com.sailmi.sailplat.foundation.service.IArticleService;
import com.sailmi.sailplat.foundation.service.IGoodsClassService;
import com.sailmi.sailplat.foundation.service.INavigationService;

import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
 
 @Component
 @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
 public class NavViewTools
 {
 
   @Autowired
   private INavigationService navService;
 
   @Autowired
   private IArticleService articleService;
 
   @Autowired
   private IActivityService activityService;
 
   @Autowired
   private IGoodsClassService goodsClassService;
 
   public List<Navigation> queryNav(int location, int count)
   {
     List navs = new ArrayList();
     Map params = new HashMap();
     params.put("display", Boolean.valueOf(true));
     params.put("location", Integer.valueOf(location));
     params.put("type", "sparegoods");
     navs = this.navService
       .query("select obj from Navigation obj where obj.display=:display and obj.location=:location and obj.type!=:type order by obj.sequence asc", params, 0, count);
     return navs;
   }
 }


 
 
 