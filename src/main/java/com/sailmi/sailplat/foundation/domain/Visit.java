 package com.sailmi.sailplat.foundation.domain;
 
 import java.util.Date;
 import javax.persistence.Entity;
 import javax.persistence.FetchType;
 import javax.persistence.ManyToOne;
 import javax.persistence.OneToOne;
 import javax.persistence.Table;
 import org.hibernate.annotations.Cache;
 import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sailmi.database.domain.IdEntity;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="tbl_Visit")
 public class Visit extends IdEntity
 {
 
   //主页
   @ManyToOne
   private HomePage homepage;
 
   //用户
   @OneToOne
   private User user;
   //浏览时间
   private Date visitTime;
 
   public HomePage getHomepage()
   {
     return this.homepage;
   }
 
   public void setHomepage(HomePage homepage) {
     this.homepage = homepage;
   }
 
   public User getUser() {
     return this.user;
   }
 
   public void setUser(User user) {
     this.user = user;
   }
 
   public Date getVisitTime() {
     return this.visitTime;
   }
 
   public void setVisitTime(Date visitTime) {
     this.visitTime = visitTime;
   }
 }



 
 