package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblStoreStat.
 * @see com.sailmi.sailplat.foundation.domain.TblStoreStat
 * @author Hibernate Tools
 */
@Stateless
public class TblStoreStatHome {

	private static final Log log = LogFactory.getLog(TblStoreStatHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblStoreStat transientInstance) {
		log.debug("persisting TblStoreStat instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblStoreStat persistentInstance) {
		log.debug("removing TblStoreStat instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblStoreStat merge(TblStoreStat detachedInstance) {
		log.debug("merging TblStoreStat instance");
		try {
			TblStoreStat result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblStoreStat findById(Long id) {
		log.debug("getting TblStoreStat instance with id: " + id);
		try {
			TblStoreStat instance = entityManager.find(TblStoreStat.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
