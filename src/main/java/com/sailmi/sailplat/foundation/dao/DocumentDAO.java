package com.sailmi.sailplat.foundation.dao;

import com.sailmi.database.base.GenericDAO;
import com.sailmi.sailplat.foundation.domain.Document;

import org.springframework.stereotype.Repository;

@Repository("documentDAO")
public class DocumentDAO extends GenericDAO<Document>
{
}

