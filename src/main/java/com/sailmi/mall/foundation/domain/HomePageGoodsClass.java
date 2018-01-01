 package com.sailmi.mall.foundation.domain;
 
 import javax.persistence.Entity;
 import javax.persistence.FetchType;
 import javax.persistence.ManyToOne;
 import javax.persistence.Table;
 import org.hibernate.annotations.Cache;
 import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sailmi.mall.core.domain.IdEntity;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="sailmall_homepage_goodsclass")
 public class HomePageGoodsClass extends IdEntity
 {
   //用户
   @ManyToOne
   private User user;
   //商品类型
   @ManyToOne
   private GoodsClass gc;
 
   public GoodsClass getGc()
   {
     return this.gc;
   }
 
   public void setGc(GoodsClass gc) {
     this.gc = gc;
   }
 
   public User getUser() {
     return this.user;
   }
 
   public void setUser(User user) {
     this.user = user;
   }
 }



 
 