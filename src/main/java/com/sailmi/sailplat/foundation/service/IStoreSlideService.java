package com.sailmi.sailplat.foundation.service;

import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.StoreSlide;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStoreSlideService
{
  public abstract boolean save(StoreSlide paramStoreSlide);

  public abstract StoreSlide getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(StoreSlide paramStoreSlide);

  public abstract List<StoreSlide> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 