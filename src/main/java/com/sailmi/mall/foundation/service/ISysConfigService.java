package com.sailmi.mall.foundation.service;

import com.sailmi.mall.foundation.domain.SysConfig;

public abstract interface ISysConfigService
{
  public abstract boolean save(SysConfig paramSysConfig);

  public abstract boolean delete(SysConfig paramSysConfig);

  public abstract boolean update(SysConfig paramSysConfig);

  public abstract SysConfig getSysConfig();
}



 
 