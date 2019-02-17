 package com.sailmi.sailplat.foundation.service.impl;
 
 import com.sailmi.database.dao.IGenericDAO;
import com.sailmi.database.query.GenericPageList;
import com.sailmi.database.query.PageObject;
import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.Complaint;
import com.sailmi.sailplat.foundation.service.IComplaintService;

import java.io.Serializable;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class ComplaintServiceImpl
   implements IComplaintService
 {
 
   @Resource(name="complaintDAO")
   private IGenericDAO<Complaint> complaintDao;
 
   public boolean save(Complaint complaint)
   {
     try
     {
       this.complaintDao.save(complaint);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public Complaint getObjById(Long id)
   {
     Complaint complaint = (Complaint)this.complaintDao.get(id);
     if (complaint != null) {
       return complaint;
     }
     return null;
   }
 
   public boolean delete(Long id) {
     try {
       this.complaintDao.remove(id);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public boolean batchDelete(List<Serializable> complaintIds)
   {
     for (Serializable id : complaintIds) {
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
     GenericPageList pList = new GenericPageList(Complaint.class, query, 
       params, this.complaintDao);
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
 
   public boolean update(Complaint complaint) {
     try {
       this.complaintDao.update(complaint);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public List<Complaint> query(String query, Map params, int begin, int max) {
     return this.complaintDao.query(query, params, begin, max);
   }
 }



 
 