package com.sailmi.sailplat.foundation.service;

import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.SpareGoodsClass;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface ISpareGoodsClassService
{
  public abstract boolean save(SpareGoodsClass paramSpareGoodsClass);

  public abstract SpareGoodsClass getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(SpareGoodsClass paramSpareGoodsClass);

  public abstract List<SpareGoodsClass> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 