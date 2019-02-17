package com.sailmi.sailplat.foundation.service;

import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.RoleGroup;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IRoleGroupService
{
  public abstract boolean save(RoleGroup paramRoleGroup);

  public abstract RoleGroup getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(RoleGroup paramRoleGroup);

  public abstract List<RoleGroup> query(String paramString, Map paramMap, int paramInt1, int paramInt2);

  public abstract RoleGroup getObjByProperty(String paramString, Object paramObject);
}



 
 