package com.sailmi.sailplat.foundation.dao;

import com.sailmi.database.base.GenericDAO;
import com.sailmi.sailplat.foundation.domain.UserConfig;

import org.springframework.stereotype.Repository;

@Repository("userConfigDAO")
public class UserConfigDAO extends GenericDAO<UserConfig>
{
}

