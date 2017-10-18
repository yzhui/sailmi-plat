 package com.sailmi.mall.foundation.domain;
 
 import java.util.ArrayList;
 import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
 import javax.persistence.FetchType;
 import javax.persistence.OneToMany;
 import javax.persistence.OneToOne;
 import javax.persistence.Table;
 import org.hibernate.annotations.Cache;
 import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sailmi.mall.core.domain.IdEntity;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="smmall_homepage")
 public class HomePage extends IdEntity
 {
   //拥有者
   @OneToOne(fetch=FetchType.LAZY,mappedBy="homePage")
   private User owner;
   //浏览顾客
   @OneToMany(mappedBy="homepage", cascade={javax.persistence.CascadeType.REMOVE})
   private List<Visit> customers = new ArrayList();
 
   public User getOwner() {
     return this.owner;
   }
 
   public void setOwner(User owner) {
     this.owner = owner;
   }
 
   public List<Visit> getCustomers() {
     return this.customers;
   }
 
   public void setCustomers(List<Visit> customers) {
     this.customers = customers;
   }
 }



 
 