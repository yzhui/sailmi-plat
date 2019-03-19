package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblFavorite.
 * @see com.sailmi.sailplat.foundation.domain.TblFavorite
 * @author Hibernate Tools
 */
@Stateless
public class TblFavoriteHome {

	private static final Log log = LogFactory.getLog(TblFavoriteHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblFavorite transientInstance) {
		log.debug("persisting TblFavorite instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblFavorite persistentInstance) {
		log.debug("removing TblFavorite instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblFavorite merge(TblFavorite detachedInstance) {
		log.debug("merging TblFavorite instance");
		try {
			TblFavorite result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblFavorite findById(Long id) {
		log.debug("getting TblFavorite instance with id: " + id);
		try {
			TblFavorite instance = entityManager.find(TblFavorite.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
