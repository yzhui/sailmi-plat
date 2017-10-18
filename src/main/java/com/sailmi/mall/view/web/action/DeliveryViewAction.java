 package com.sailmi.mall.view.web.action;
 
 import com.sailmi.mall.core.domain.virtual.SysMap;
 import com.sailmi.mall.core.mv.JModelAndView;
 import com.sailmi.mall.core.query.support.IPageList;
 import com.sailmi.mall.core.tools.CommUtil;
 import com.sailmi.mall.foundation.domain.query.DeliveryGoodsQueryObject;
 import com.sailmi.mall.foundation.service.IDeliveryGoodsService;
 import com.sailmi.mall.foundation.service.ISysConfigService;
 import com.sailmi.mall.foundation.service.IUserConfigService;
 import java.util.Date;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.servlet.ModelAndView;
 
 @Controller
 public class DeliveryViewAction
 {
 
   @Autowired
   private ISysConfigService configService;
 
   @Autowired
   private IUserConfigService userConfigService;
 
   @Autowired
   private IDeliveryGoodsService deliveryGoodsService;
 
   @RequestMapping({"/delivery.htm"})
   public ModelAndView delivery(HttpServletRequest request, HttpServletResponse response, String id, String currentPage, String orderBy, String orderType)
   {
     ModelAndView mv = new JModelAndView("delivery.html", 
       this.configService.getSysConfig(), 
       this.userConfigService.getUserConfig(), 1, request, response);
     DeliveryGoodsQueryObject qo = new DeliveryGoodsQueryObject(currentPage, 
       mv, orderBy, orderType);
     qo.addQuery("obj.d_status", new SysMap("d_status", Integer.valueOf(1)), "=");
     qo.addQuery("obj.d_begin_time", new SysMap("d_begin_time", new Date()), 
       "<=");
     qo.addQuery("obj.d_end_time", new SysMap("d_end_time", new Date()), 
       ">=");
     qo.setPageSize(Integer.valueOf(20));
     IPageList pList = this.deliveryGoodsService.list(qo);
     CommUtil.saveIPageList2ModelAndView("", "", "", pList, mv);
     return mv;
   }
 }


 
 
 