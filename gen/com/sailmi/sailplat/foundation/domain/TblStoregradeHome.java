package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblStoregrade.
 * @see com.sailmi.sailplat.foundation.domain.TblStoregrade
 * @author Hibernate Tools
 */
@Stateless
public class TblStoregradeHome {

	private static final Log log = LogFactory.getLog(TblStoregradeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblStoregrade transientInstance) {
		log.debug("persisting TblStoregrade instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblStoregrade persistentInstance) {
		log.debug("removing TblStoregrade instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblStoregrade merge(TblStoregrade detachedInstance) {
		log.debug("merging TblStoregrade instance");
		try {
			TblStoregrade result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblStoregrade findById(Long id) {
		log.debug("getting TblStoregrade instance with id: " + id);
		try {
			TblStoregrade instance = entityManager.find(TblStoregrade.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
