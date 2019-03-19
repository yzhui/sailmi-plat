package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblStore.
 * @see com.sailmi.sailplat.foundation.domain.TblStore
 * @author Hibernate Tools
 */
@Stateless
public class TblStoreHome {

	private static final Log log = LogFactory.getLog(TblStoreHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblStore transientInstance) {
		log.debug("persisting TblStore instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblStore persistentInstance) {
		log.debug("removing TblStore instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblStore merge(TblStore detachedInstance) {
		log.debug("merging TblStore instance");
		try {
			TblStore result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblStore findById(Long id) {
		log.debug("getting TblStore instance with id: " + id);
		try {
			TblStore instance = entityManager.find(TblStore.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
