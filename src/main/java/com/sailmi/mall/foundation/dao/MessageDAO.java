package com.sailmi.mall.foundation.dao;

import com.sailmi.mall.core.base.GenericDAO;
import com.sailmi.mall.foundation.domain.Message;
import org.springframework.stereotype.Repository;

@Repository("messageDAO")
public class MessageDAO extends GenericDAO<Message>
{
}

