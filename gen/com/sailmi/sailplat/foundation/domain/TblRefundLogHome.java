package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblRefundLog.
 * @see com.sailmi.sailplat.foundation.domain.TblRefundLog
 * @author Hibernate Tools
 */
@Stateless
public class TblRefundLogHome {

	private static final Log log = LogFactory.getLog(TblRefundLogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblRefundLog transientInstance) {
		log.debug("persisting TblRefundLog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblRefundLog persistentInstance) {
		log.debug("removing TblRefundLog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblRefundLog merge(TblRefundLog detachedInstance) {
		log.debug("merging TblRefundLog instance");
		try {
			TblRefundLog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblRefundLog findById(Long id) {
		log.debug("getting TblRefundLog instance with id: " + id);
		try {
			TblRefundLog instance = entityManager.find(TblRefundLog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
