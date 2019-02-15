package com.sailmi.sailplat.core.dialect;

import org.hibernate.dialect.MySQL5Dialect;
import org.hibernate.type.TextType;

public class SystemMySQL5Dialect extends MySQL5Dialect
{
  public SystemMySQL5Dialect()
  {
    registerHibernateType(-1,TextType.class.getName());
  }
}