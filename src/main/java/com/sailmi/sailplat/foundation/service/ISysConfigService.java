package com.sailmi.sailplat.foundation.service;

import com.sailmi.sailplat.foundation.domain.SysConfig;
import com.sailmi.sailplat.security.SecurityAuthType;

public abstract interface ISysConfigService
{
  public abstract boolean save(SysConfig paramSysConfig);

  public abstract boolean delete(SysConfig paramSysConfig);

  public abstract boolean update(SysConfig paramSysConfig);

  public abstract SysConfig getSysConfig();
  
  public abstract SecurityAuthType getSecurityAuthType();
}



 
 