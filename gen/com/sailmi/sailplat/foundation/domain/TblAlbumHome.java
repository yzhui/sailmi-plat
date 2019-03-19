package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblAlbum.
 * @see com.sailmi.sailplat.foundation.domain.TblAlbum
 * @author Hibernate Tools
 */
@Stateless
public class TblAlbumHome {

	private static final Log log = LogFactory.getLog(TblAlbumHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblAlbum transientInstance) {
		log.debug("persisting TblAlbum instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblAlbum persistentInstance) {
		log.debug("removing TblAlbum instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblAlbum merge(TblAlbum detachedInstance) {
		log.debug("merging TblAlbum instance");
		try {
			TblAlbum result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblAlbum findById(Long id) {
		log.debug("getting TblAlbum instance with id: " + id);
		try {
			TblAlbum instance = entityManager.find(TblAlbum.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
