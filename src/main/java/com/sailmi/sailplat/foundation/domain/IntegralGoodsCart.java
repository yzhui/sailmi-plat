 package com.sailmi.sailplat.foundation.domain;
 
 import java.math.BigDecimal;
 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.FetchType;
 import javax.persistence.ManyToOne;
 import javax.persistence.Table;
 import org.hibernate.annotations.Cache;
 import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sailmi.sailplat.core.domain.IdEntity;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="tbl_integral_goodscart")
 public class IntegralGoodsCart extends IdEntity
 {
   //商品
   @ManyToOne
   private IntegralGoods goods;
   //总数
   private int count;
   
   //订单
   @ManyToOne( cascade={javax.persistence.CascadeType.REMOVE})
   private IntegralGoodsOrder order;
   
   @Column(precision=12, scale=2)
   private BigDecimal trans_fee;
   private int integral;
 
   public IntegralGoodsOrder getOrder()
   {
     return this.order;
   }
 
   public void setOrder(IntegralGoodsOrder order) {
     this.order = order;
   }
 
   public BigDecimal getTrans_fee() {
     return this.trans_fee;
   }
 
   public void setTrans_fee(BigDecimal trans_fee) {
     this.trans_fee = trans_fee;
   }
 
   public int getIntegral() {
     return this.integral;
   }
 
   public void setIntegral(int integral) {
     this.integral = integral;
   }
 
   public IntegralGoods getGoods() {
     return this.goods;
   }
 
   public void setGoods(IntegralGoods goods) {
     this.goods = goods;
   }
 
   public int getCount() {
     return this.count;
   }
 
   public void setCount(int count) {
     this.count = count;
   }
 }



 
 