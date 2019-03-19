package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblIntegralGoods.
 * @see com.sailmi.sailplat.foundation.domain.TblIntegralGoods
 * @author Hibernate Tools
 */
@Stateless
public class TblIntegralGoodsHome {

	private static final Log log = LogFactory.getLog(TblIntegralGoodsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblIntegralGoods transientInstance) {
		log.debug("persisting TblIntegralGoods instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblIntegralGoods persistentInstance) {
		log.debug("removing TblIntegralGoods instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblIntegralGoods merge(TblIntegralGoods detachedInstance) {
		log.debug("merging TblIntegralGoods instance");
		try {
			TblIntegralGoods result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblIntegralGoods findById(Long id) {
		log.debug("getting TblIntegralGoods instance with id: " + id);
		try {
			TblIntegralGoods instance = entityManager.find(TblIntegralGoods.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
