package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsPhoto.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsPhoto
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsPhotoHome {

	private static final Log log = LogFactory.getLog(TblGoodsPhotoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsPhoto transientInstance) {
		log.debug("persisting TblGoodsPhoto instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsPhoto persistentInstance) {
		log.debug("removing TblGoodsPhoto instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsPhoto merge(TblGoodsPhoto detachedInstance) {
		log.debug("merging TblGoodsPhoto instance");
		try {
			TblGoodsPhoto result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsPhoto findById(TblGoodsPhotoId id) {
		log.debug("getting TblGoodsPhoto instance with id: " + id);
		try {
			TblGoodsPhoto instance = entityManager.find(TblGoodsPhoto.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
