package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblDeliveryLog.
 * @see com.sailmi.sailplat.foundation.domain.TblDeliveryLog
 * @author Hibernate Tools
 */
@Stateless
public class TblDeliveryLogHome {

	private static final Log log = LogFactory.getLog(TblDeliveryLogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblDeliveryLog transientInstance) {
		log.debug("persisting TblDeliveryLog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblDeliveryLog persistentInstance) {
		log.debug("removing TblDeliveryLog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblDeliveryLog merge(TblDeliveryLog detachedInstance) {
		log.debug("merging TblDeliveryLog instance");
		try {
			TblDeliveryLog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblDeliveryLog findById(Long id) {
		log.debug("getting TblDeliveryLog instance with id: " + id);
		try {
			TblDeliveryLog instance = entityManager.find(TblDeliveryLog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
