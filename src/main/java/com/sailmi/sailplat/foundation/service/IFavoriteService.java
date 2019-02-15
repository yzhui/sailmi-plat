package com.sailmi.sailplat.foundation.service;

import com.sailmi.sailplat.core.query.support.IPageList;
import com.sailmi.sailplat.core.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.Favorite;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IFavoriteService
{
  public abstract boolean save(Favorite paramFavorite);

  public abstract Favorite getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(Favorite paramFavorite);

  public abstract List<Favorite> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 