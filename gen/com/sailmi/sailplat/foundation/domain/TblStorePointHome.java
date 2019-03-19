package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblStorePoint.
 * @see com.sailmi.sailplat.foundation.domain.TblStorePoint
 * @author Hibernate Tools
 */
@Stateless
public class TblStorePointHome {

	private static final Log log = LogFactory.getLog(TblStorePointHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblStorePoint transientInstance) {
		log.debug("persisting TblStorePoint instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblStorePoint persistentInstance) {
		log.debug("removing TblStorePoint instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblStorePoint merge(TblStorePoint detachedInstance) {
		log.debug("merging TblStorePoint instance");
		try {
			TblStorePoint result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblStorePoint findById(Long id) {
		log.debug("getting TblStorePoint instance with id: " + id);
		try {
			TblStorePoint instance = entityManager.find(TblStorePoint.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
