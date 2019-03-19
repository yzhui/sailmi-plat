package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblDynamic.
 * @see com.sailmi.sailplat.foundation.domain.TblDynamic
 * @author Hibernate Tools
 */
@Stateless
public class TblDynamicHome {

	private static final Log log = LogFactory.getLog(TblDynamicHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblDynamic transientInstance) {
		log.debug("persisting TblDynamic instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblDynamic persistentInstance) {
		log.debug("removing TblDynamic instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblDynamic merge(TblDynamic detachedInstance) {
		log.debug("merging TblDynamic instance");
		try {
			TblDynamic result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblDynamic findById(Long id) {
		log.debug("getting TblDynamic instance with id: " + id);
		try {
			TblDynamic instance = entityManager.find(TblDynamic.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
