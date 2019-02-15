package com.sailmi.sailplat.foundation.service;

import com.sailmi.sailplat.core.query.support.IPageList;
import com.sailmi.sailplat.core.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.Advert;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IAdvertService
{
  public abstract boolean save(Advert paramAdvert);

  public abstract Advert getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(Advert paramAdvert);

  public abstract List<Advert> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 