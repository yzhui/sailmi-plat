package com.sailmi.sailplat.foundation.service;

import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.DeliveryGoods;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IDeliveryGoodsService
{
  public abstract boolean save(DeliveryGoods paramDeliveryGoods);

  public abstract DeliveryGoods getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(DeliveryGoods paramDeliveryGoods);

  public abstract List<DeliveryGoods> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 