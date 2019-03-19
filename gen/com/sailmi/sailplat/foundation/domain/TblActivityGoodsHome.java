package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblActivityGoods.
 * @see com.sailmi.sailplat.foundation.domain.TblActivityGoods
 * @author Hibernate Tools
 */
@Stateless
public class TblActivityGoodsHome {

	private static final Log log = LogFactory.getLog(TblActivityGoodsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblActivityGoods transientInstance) {
		log.debug("persisting TblActivityGoods instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblActivityGoods persistentInstance) {
		log.debug("removing TblActivityGoods instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblActivityGoods merge(TblActivityGoods detachedInstance) {
		log.debug("merging TblActivityGoods instance");
		try {
			TblActivityGoods result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblActivityGoods findById(Long id) {
		log.debug("getting TblActivityGoods instance with id: " + id);
		try {
			TblActivityGoods instance = entityManager.find(TblActivityGoods.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
