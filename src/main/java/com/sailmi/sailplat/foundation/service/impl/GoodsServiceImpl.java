 package com.sailmi.sailplat.foundation.service.impl;
 
 import com.sailmi.database.dao.IGenericDAO;
import com.sailmi.database.query.GenericPageList;
import com.sailmi.database.query.PageObject;
import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.Goods;
import com.sailmi.sailplat.foundation.service.IGoodsService;

import java.io.Serializable;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class GoodsServiceImpl
   implements IGoodsService
 {
 
   @Resource(name="goodsDAO")
   private IGenericDAO<Goods> goodsDao;
 
   public boolean save(Goods goods)
   {
     try
     {
       this.goodsDao.save(goods);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public Goods getObjById(Long id)
   {
     Goods goods = (Goods)this.goodsDao.get(id);
     if (goods != null) {
       return goods;
     }
     return null;
   }
 
   public boolean delete(Long id) {
     try {
       this.goodsDao.remove(id);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public boolean batchDelete(List<Serializable> goodsIds)
   {
     for (Serializable id : goodsIds) {
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
     GenericPageList pList = new GenericPageList(Goods.class, query, 
       params, this.goodsDao);
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
 
   public boolean update(Goods goods) {
     try {
       this.goodsDao.update(goods);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public List<Goods> query(String query, Map params, int begin, int max) {
     return this.goodsDao.query(query, params, begin, max);
   }
 
   public Goods getObjByProperty(String propertyName, Object value)
   {
     return (Goods)this.goodsDao.getBy(propertyName, value);
   }
 }



 
 