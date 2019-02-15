package com.sailmi.sailplat.foundation.dao;

import com.sailmi.sailplat.core.base.GenericDAO;
import com.sailmi.sailplat.foundation.domain.User;

import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAO extends GenericDAO<User>
{
}

