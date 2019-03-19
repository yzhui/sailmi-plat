package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblStoreSlide.
 * @see com.sailmi.sailplat.foundation.domain.TblStoreSlide
 * @author Hibernate Tools
 */
@Stateless
public class TblStoreSlideHome {

	private static final Log log = LogFactory.getLog(TblStoreSlideHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblStoreSlide transientInstance) {
		log.debug("persisting TblStoreSlide instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblStoreSlide persistentInstance) {
		log.debug("removing TblStoreSlide instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblStoreSlide merge(TblStoreSlide detachedInstance) {
		log.debug("merging TblStoreSlide instance");
		try {
			TblStoreSlide result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblStoreSlide findById(Long id) {
		log.debug("getting TblStoreSlide instance with id: " + id);
		try {
			TblStoreSlide instance = entityManager.find(TblStoreSlide.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
