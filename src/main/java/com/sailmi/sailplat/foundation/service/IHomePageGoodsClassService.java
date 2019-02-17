package com.sailmi.sailplat.foundation.service;

import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.HomePageGoodsClass;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IHomePageGoodsClassService
{
  public abstract boolean save(HomePageGoodsClass paramHomePageGoodsClass);

  public abstract HomePageGoodsClass getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(HomePageGoodsClass paramHomePageGoodsClass);

  public abstract List<HomePageGoodsClass> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 