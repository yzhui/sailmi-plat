 package com.sailmi.sailplat.mall.view.web.tools;
 
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sailmi.sailplat.foundation.domain.Area;
import com.sailmi.sailplat.foundation.service.IAreaService;
import com.sailmi.tools.CommUtil;
 
 

 @Component
 @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
 public class AreaViewTools
 {
 
   @Autowired
   private IAreaService areaService;

   @Transactional
   public String generic_area_info(String area_id)
   {
     String area_info = "";
     Area area = this.areaService.getObjById(CommUtil.null2Long(area_id));
     if (area != null) {
       area_info = area.getAreaName() + " ";
       if (area.getParent() != null) {
         String info = generic_area_info(area.getParent().getId()
           .toString());
         area_info = info + area_info;
       }
     }
     return area_info;
   }
 }


 
 
 