package com.sailmi.sailplat.foundation.dao;

import com.sailmi.database.base.GenericDAO;
import com.sailmi.sailplat.foundation.domain.Message;

import org.springframework.stereotype.Repository;

@Repository("messageDAO")
public class MessageDAO extends GenericDAO<Message>
{
}

