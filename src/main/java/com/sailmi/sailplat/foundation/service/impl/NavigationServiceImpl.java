 package com.sailmi.sailplat.foundation.service.impl;
 
 import com.sailmi.database.dao.IGenericDAO;
import com.sailmi.database.query.GenericPageList;
import com.sailmi.database.query.PageObject;
import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.Navigation;
import com.sailmi.sailplat.foundation.service.INavigationService;

import java.io.Serializable;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class NavigationServiceImpl
   implements INavigationService
 {
 
   @Resource(name="navigationDAO")
   private IGenericDAO<Navigation> navigationDao;
 
   public boolean save(Navigation navigation)
   {
     try
     {
       this.navigationDao.save(navigation);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public Navigation getObjById(Long id)
   {
     Navigation navigation = (Navigation)this.navigationDao.get(id);
     if (navigation != null) {
       return navigation;
     }
     return null;
   }
 
   public boolean delete(Long id) {
     try {
       this.navigationDao.remove(id);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public boolean batchDelete(List<Serializable> navigationIds)
   {
     for (Serializable id : navigationIds) {
       delete((Long)id);
     }
     return true;
   }
 
   public IPageList list(IQueryObject properties) {
     if (properties == null) {
       return null;
     }
     String query = properties.getQuery();
     Map params = properties.getParameters();
     GenericPageList pList = new GenericPageList(Navigation.class, query, 
       params, this.navigationDao);
     if (properties != null) {
       PageObject pageObj = properties.getPageObj();
       if (pageObj != null)
         pList.doList(pageObj.getCurrentPage() == null ? 0 : pageObj
           .getCurrentPage().intValue(), pageObj.getPageSize() == null ? 0 : 
           pageObj.getPageSize().intValue());
     } else {
       pList.doList(0, -1);
     }return pList;
   }
 
   public boolean update(Navigation navigation) {
     try {
       this.navigationDao.update(navigation);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public List<Navigation> query(String query, Map params, int begin, int max) {
     return this.navigationDao.query(query, params, begin, max);
   }
 }



 
 