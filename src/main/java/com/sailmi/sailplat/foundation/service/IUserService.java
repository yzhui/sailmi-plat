package com.sailmi.sailplat.foundation.service;

import com.sailmi.sailplat.core.query.support.IPageList;
import com.sailmi.sailplat.core.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.User;

import java.util.List;
import java.util.Map;

public abstract interface IUserService
{
  public abstract boolean save(User paramUser);

  public abstract boolean delete(Long paramLong);

  public abstract boolean update(User paramUser);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract User getObjById(Long paramLong);

  public abstract User getObjByProperty(String paramString1, String paramString2);

  public abstract List<User> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 