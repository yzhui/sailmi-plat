 package com.sailmi.sailplat.manage.buyer.action;
 
 import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sailmi.annotation.SecurityMapping;
import com.sailmi.database.DatabaseTools;
import com.sailmi.database.domain.virtual.SysMap;
import com.sailmi.database.query.support.IPageList;
import com.sailmi.sailplat.foundation.domain.Address;
import com.sailmi.sailplat.foundation.domain.Area;
import com.sailmi.sailplat.foundation.domain.query.AddressQueryObject;
import com.sailmi.sailplat.foundation.service.IAddressService;
import com.sailmi.sailplat.foundation.service.IAreaService;
import com.sailmi.sailplat.foundation.service.ISysConfigService;
import com.sailmi.sailplat.foundation.service.IUserConfigService;
import com.sailmi.sailplat.security.support.SecurityUserHolder;
import com.sailmi.tools.CommUtil;
import com.sailmi.tools.WebForm;
import com.sailmi.tools.mv.JModelAndView;
 
 @Controller
 public class AddressBuyerAction
 {
 
   @Autowired
   private ISysConfigService configService;
 
   @Autowired
   private IUserConfigService userConfigService;
 
   @Autowired
   private IAddressService addressService;
 
   @Autowired
   private IAreaService areaService;
 
   @Autowired
   private DatabaseTools databaseTools;
 
   @SecurityMapping(display = false, rsequence = 0, title="收货地址列表", value="/buyer/address.htm*", rtype="buyer", rname="用户中心", rcode="user_center", rgroup="用户中心")
   @RequestMapping({"/buyer/address.htm"})
   public ModelAndView address(HttpServletRequest request, HttpServletResponse response, String currentPage, String orderBy, String orderType)
   {
     ModelAndView mv = new JModelAndView("user/default/usercenter/address.html", this.configService.getSysConfig(), 
       this.userConfigService.getUserConfig(), 0, request, response);
     String tbl_view_type = CommUtil.null2String( request.getSession( false ).getAttribute( "tbl_view_type" ) );
	 if( (tbl_view_type != null) && (!tbl_view_type.equals( "" )) && (tbl_view_type.equals( "mobile" )) ) {
		 mv = new JModelAndView("mobile/address.html", this.configService.getSysConfig(), 
			       this.userConfigService.getUserConfig(), 1, request, response);
	 }
     String url = this.configService.getSysConfig().getAddress();
     if ((url == null) || (url.equals(""))) {
       url = CommUtil.getURL(request);
     }
     String params = "";
     AddressQueryObject qo = new AddressQueryObject(currentPage, mv, orderBy, orderType);
     qo.addQuery("obj.user.id", new SysMap("user_id", SecurityUserHolder.getCurrentUser().getId()), "=");
     IPageList pList = this.addressService.list(qo);
     CommUtil.saveIPageList2ModelAndView(url + "/buyer/address.htm", "", params, pList, mv);
     List areas = this.areaService.query("select obj from Area obj where obj.parent.id is null", null, -1, -1);
     mv.addObject("areas", areas);
     return mv;
   }
    /**
     * 新增收货地址页面
	 * @param request
	 * @param response
	 * @param currentPage
	 * @return
	 */
   @SecurityMapping(display = false, rsequence = 0, title="新增收货地址", value="/buyer/address_add.htm*", rtype="buyer", rname="用户中心", rcode="user_center", rgroup="用户中心")
   @RequestMapping({"/buyer/address_add.htm"})
   public ModelAndView address_add(HttpServletRequest request, HttpServletResponse response, String currentPage) {
     ModelAndView mv = new JModelAndView("user/default/usercenter/address_add.html", this.configService.getSysConfig(), 
       this.userConfigService.getUserConfig(), 0, request, response);
     String tbl_view_type = CommUtil.null2String( request.getSession().getAttribute( "tbl_view_type" ) );
	 if( (tbl_view_type != null) && (!tbl_view_type.equals( "" )) && (tbl_view_type.equals( "mobile" )) ) {
		 mv = new JModelAndView("mobile/address_add.html", this.configService.getSysConfig(), 
			       this.userConfigService.getUserConfig(), 1, request, response);
	 }
     List areas = this.areaService.query("select obj from Area obj where obj.parent.id is null", null, -1, -1);
     mv.addObject("areas", areas);
     mv.addObject("currentPage", currentPage);
     return mv;
   }
   @SecurityMapping(display = false, rsequence = 0, title="新增收货地址", value="/buyer/address_edit.htm*", rtype="buyer", rname="用户中心", rcode="user_center", rgroup="用户中心")
   @RequestMapping({"/buyer/address_edit.htm"})
   public ModelAndView address_edit(HttpServletRequest request, HttpServletResponse response, String id, String currentPage) {
     ModelAndView mv = new JModelAndView("user/default/usercenter/address_add.html", this.configService.getSysConfig(), 
       this.userConfigService.getUserConfig(), 0, request, response);
     String tbl_view_type = CommUtil.null2String( request.getSession().getAttribute( "tbl_view_type" ) );
	 if( (tbl_view_type != null) && (!tbl_view_type.equals( "" )) && (tbl_view_type.equals( "mobile" )) ) {
		 mv = new JModelAndView("mobile/address_add.html", this.configService.getSysConfig(), 
			       this.userConfigService.getUserConfig(), 1, request, response);
	 }
     List areas = this.areaService.query("select obj from Area obj where obj.parent.id is null", null, -1, -1);
     Address obj = this.addressService.getObjById(CommUtil.null2Long(id));
     mv.addObject("obj", obj);
     mv.addObject("areas", areas);
     mv.addObject("currentPage", currentPage);
     return mv;
   }
 
   @SecurityMapping(display = false, rsequence = 0, title="收货地址保存", value="/buyer/address_save.htm*", rtype="buyer", rname="用户中心", rcode="user_center", rgroup="用户中心")
   @RequestMapping({"/buyer/address_save.htm"})
   public String address_save(HttpServletRequest request, HttpServletResponse response, String id, String area_id, String currentPage)
   {
     WebForm wf = new WebForm();
     Address address = null;
     if (id.equals("")) {
       address = (Address)wf.toPo(request, Address.class);
       address.setAddTime(new Date());
     } else {
       Address obj = this.addressService.getObjById(Long.valueOf(Long.parseLong(id)));
       address = (Address)wf.toPo(request, obj);
     }
     address.setUser(SecurityUserHolder.getCurrentUser());
     Area area = this.areaService.getObjById(CommUtil.null2Long(area_id));
     address.setArea(area);
     if (id.equals(""))
       this.addressService.save(address);
     else
       this.addressService.update(address);
     return "redirect:address.htm?currentPage=" + currentPage;
   }
   @SecurityMapping(display = false, rsequence = 0, title="收货地址删除", value="/buyer/address_del.htm*", rtype="buyer", rname="用户中心", rcode="user_center", rgroup="用户中心")
   @RequestMapping({"/buyer/address_del.htm"})
   public String address_del(HttpServletRequest request, HttpServletResponse response, String mulitId, String currentPage) {
     String[] ids = mulitId.split(",");
     for (String id : ids) {
       if (!id.equals("")) {
         Address address = this.addressService.getObjById(
           Long.valueOf(Long.parseLong(id)));
         this.addressService.delete(Long.valueOf(Long.parseLong(id)));
       }
     }
     return "redirect:address.htm?currentPage=" + currentPage;
   }
 }


 
 
 