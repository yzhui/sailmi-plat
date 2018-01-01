 package com.sailmi.mall.view.web.tools;
 
 import com.sailmi.mall.core.tools.CommUtil;
 import com.sailmi.mall.foundation.domain.GroupGoods;
 import com.sailmi.mall.foundation.service.IGroupGoodsService;
 import com.sailmi.mall.foundation.service.IGroupService;
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
 public class GroupViewTools
 {
 
   @Autowired
   private IGroupService groupService;
 
   @Autowired
   private IGroupGoodsService groupGoodsService;
 
   public List<GroupGoods> query_goods(String group_id, int count)
   {
     List list = new ArrayList();
     Map params = new HashMap();
     params.put("group_id", CommUtil.null2Long(group_id));
     list = this.groupGoodsService
       .query(
       "select obj from GroupGoods obj where obj.group.id=:group_id order by obj.addTime desc", 
       params, 0, count);
     return list;
   }
 }


 
 
 