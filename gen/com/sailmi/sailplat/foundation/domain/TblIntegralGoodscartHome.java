package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblIntegralGoodscart.
 * @see com.sailmi.sailplat.foundation.domain.TblIntegralGoodscart
 * @author Hibernate Tools
 */
@Stateless
public class TblIntegralGoodscartHome {

	private static final Log log = LogFactory.getLog(TblIntegralGoodscartHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblIntegralGoodscart transientInstance) {
		log.debug("persisting TblIntegralGoodscart instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblIntegralGoodscart persistentInstance) {
		log.debug("removing TblIntegralGoodscart instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblIntegralGoodscart merge(TblIntegralGoodscart detachedInstance) {
		log.debug("merging TblIntegralGoodscart instance");
		try {
			TblIntegralGoodscart result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblIntegralGoodscart findById(Long id) {
		log.debug("getting TblIntegralGoodscart instance with id: " + id);
		try {
			TblIntegralGoodscart instance = entityManager.find(TblIntegralGoodscart.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
