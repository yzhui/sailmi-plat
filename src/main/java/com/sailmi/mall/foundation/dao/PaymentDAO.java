package com.sailmi.mall.foundation.dao;

import com.sailmi.mall.core.base.GenericDAO;
import com.sailmi.mall.foundation.domain.Payment;
import org.springframework.stereotype.Repository;

@Repository("paymentDAO")
public class PaymentDAO extends GenericDAO<Payment>
{
}
