package com.sailmi.sailplat.foundation.dao;

import com.sailmi.database.base.GenericDAO;
import com.sailmi.sailplat.foundation.domain.Payment;

import org.springframework.stereotype.Repository;

@Repository("paymentDAO")
public class PaymentDAO extends GenericDAO<Payment>
{
}
