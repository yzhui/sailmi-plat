package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblNavigation.
 * @see com.sailmi.sailplat.foundation.domain.TblNavigation
 * @author Hibernate Tools
 */
@Stateless
public class TblNavigationHome {

	private static final Log log = LogFactory.getLog(TblNavigationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblNavigation transientInstance) {
		log.debug("persisting TblNavigation instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblNavigation persistentInstance) {
		log.debug("removing TblNavigation instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblNavigation merge(TblNavigation detachedInstance) {
		log.debug("merging TblNavigation instance");
		try {
			TblNavigation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblNavigation findById(Long id) {
		log.debug("getting TblNavigation instance with id: " + id);
		try {
			TblNavigation instance = entityManager.find(TblNavigation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
