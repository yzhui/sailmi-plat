package com.sailmi.sailplat.foundation.service;

import com.sailmi.sailplat.core.query.support.IPageList;
import com.sailmi.sailplat.core.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.GoodsType;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsTypeService
{
  public abstract boolean save(GoodsType paramGoodsType);

  public abstract GoodsType getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(GoodsType paramGoodsType);

  public abstract List<GoodsType> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 