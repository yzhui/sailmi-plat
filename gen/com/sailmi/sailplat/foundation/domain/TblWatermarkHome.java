package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblWatermark.
 * @see com.sailmi.sailplat.foundation.domain.TblWatermark
 * @author Hibernate Tools
 */
@Stateless
public class TblWatermarkHome {

	private static final Log log = LogFactory.getLog(TblWatermarkHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblWatermark transientInstance) {
		log.debug("persisting TblWatermark instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblWatermark persistentInstance) {
		log.debug("removing TblWatermark instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblWatermark merge(TblWatermark detachedInstance) {
		log.debug("merging TblWatermark instance");
		try {
			TblWatermark result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblWatermark findById(Long id) {
		log.debug("getting TblWatermark instance with id: " + id);
		try {
			TblWatermark instance = entityManager.find(TblWatermark.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
