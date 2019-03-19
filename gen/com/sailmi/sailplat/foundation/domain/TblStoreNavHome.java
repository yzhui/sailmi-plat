package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblStoreNav.
 * @see com.sailmi.sailplat.foundation.domain.TblStoreNav
 * @author Hibernate Tools
 */
@Stateless
public class TblStoreNavHome {

	private static final Log log = LogFactory.getLog(TblStoreNavHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblStoreNav transientInstance) {
		log.debug("persisting TblStoreNav instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblStoreNav persistentInstance) {
		log.debug("removing TblStoreNav instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblStoreNav merge(TblStoreNav detachedInstance) {
		log.debug("merging TblStoreNav instance");
		try {
			TblStoreNav result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblStoreNav findById(Long id) {
		log.debug("getting TblStoreNav instance with id: " + id);
		try {
			TblStoreNav instance = entityManager.find(TblStoreNav.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
