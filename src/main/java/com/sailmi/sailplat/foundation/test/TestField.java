 package com.sailmi.sailplat.foundation.test;
 
 import java.beans.PropertyDescriptor;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

import com.sailmi.tools.CommUtil;
 
 public class TestField
 {
   public static void main(String[] args)
     throws ClassNotFoundException
   {
     String field = "store.grade";
     if (field.indexOf(".") > 0) {
       Class entity = Class.forName("com.sailmi.mall.domain." + 
         CommUtil.first2upper(field.substring(
         field.indexOf("_") + 1, field.indexOf("."))));
 
       String propertyName = field.substring(field.indexOf(".") + 1);
       System.out.println("属性值:" + propertyName);
       BeanWrapper entity_wrapper = PropertyAccessorFactory.forBeanPropertyAccess( entity);
       PropertyDescriptor[] entity_propertys = entity_wrapper
         .getPropertyDescriptors();
       for (PropertyDescriptor pd : entity_propertys)
         if (pd.getName().equals(propertyName))
           System.out.println(pd.getName());
     }
   }
 }



 
 