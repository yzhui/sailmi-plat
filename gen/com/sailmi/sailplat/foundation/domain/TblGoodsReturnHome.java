package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsReturn.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsReturn
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsReturnHome {

	private static final Log log = LogFactory.getLog(TblGoodsReturnHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsReturn transientInstance) {
		log.debug("persisting TblGoodsReturn instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsReturn persistentInstance) {
		log.debug("removing TblGoodsReturn instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsReturn merge(TblGoodsReturn detachedInstance) {
		log.debug("merging TblGoodsReturn instance");
		try {
			TblGoodsReturn result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsReturn findById(Long id) {
		log.debug("getting TblGoodsReturn instance with id: " + id);
		try {
			TblGoodsReturn instance = entityManager.find(TblGoodsReturn.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
