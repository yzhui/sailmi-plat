package com.sailmi.mall.foundation.dao;

import com.sailmi.mall.core.base.GenericDAO;
import com.sailmi.mall.foundation.domain.User;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAO extends GenericDAO<User>
{
}

