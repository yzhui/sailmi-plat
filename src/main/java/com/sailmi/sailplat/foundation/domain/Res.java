 package com.sailmi.sailplat.foundation.domain;
 
 import java.util.ArrayList;
 import java.util.List;
 import javax.persistence.Entity;
 import javax.persistence.FetchType;
 import javax.persistence.ManyToMany;
 import javax.persistence.Table;
 import javax.persistence.Transient;
 import org.apache.commons.lang.StringUtils;
 import org.hibernate.annotations.Cache;
 import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sailmi.database.domain.IdEntity;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="tbl_res")
 public class Res extends IdEntity
 {
   //名称
   private String resName;
   //类型
   private String type;
   //价格
   private String value;
 
   //角色，因为在context加载的时候运行
   @ManyToMany(mappedBy="reses",fetch=FetchType.EAGER)
   private List<Role> roles = new ArrayList();
   //序列
   private int sequence;
   //信息
   private String info;
 
   public String getResName() {
     return this.resName;
   }
 
   public void setResName(String resName) {
     this.resName = resName;
   }
 
   public String getType() {
     return this.type;
   }
 
   public void setType(String type) {
     this.type = type;
   }
 
   public String getValue() {
     return this.value;
   }
 
   public void setValue(String value) {
     this.value = value;
   }
 
   public List<Role> getRoles() {
     return this.roles;
   }
 
   public void setRoles(List<Role> roles) {
     this.roles = roles;
   }
 
   public String getInfo() {
     return this.info;
   }
 
   public void setInfo(String info) {
     this.info = info;
   }
 
   public int getSequence() {
     return this.sequence;
   }
 
   public void setSequence(int sequence) {
     this.sequence = sequence;
   }
 }



 
 