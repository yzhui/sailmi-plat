package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblPayment.
 * @see com.sailmi.sailplat.foundation.domain.TblPayment
 * @author Hibernate Tools
 */
@Stateless
public class TblPaymentHome {

	private static final Log log = LogFactory.getLog(TblPaymentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblPayment transientInstance) {
		log.debug("persisting TblPayment instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblPayment persistentInstance) {
		log.debug("removing TblPayment instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblPayment merge(TblPayment detachedInstance) {
		log.debug("merging TblPayment instance");
		try {
			TblPayment result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblPayment findById(Long id) {
		log.debug("getting TblPayment instance with id: " + id);
		try {
			TblPayment instance = entityManager.find(TblPayment.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
