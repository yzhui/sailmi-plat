package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblDeliveryGoods.
 * @see com.sailmi.sailplat.foundation.domain.TblDeliveryGoods
 * @author Hibernate Tools
 */
@Stateless
public class TblDeliveryGoodsHome {

	private static final Log log = LogFactory.getLog(TblDeliveryGoodsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblDeliveryGoods transientInstance) {
		log.debug("persisting TblDeliveryGoods instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblDeliveryGoods persistentInstance) {
		log.debug("removing TblDeliveryGoods instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblDeliveryGoods merge(TblDeliveryGoods detachedInstance) {
		log.debug("merging TblDeliveryGoods instance");
		try {
			TblDeliveryGoods result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblDeliveryGoods findById(Long id) {
		log.debug("getting TblDeliveryGoods instance with id: " + id);
		try {
			TblDeliveryGoods instance = entityManager.find(TblDeliveryGoods.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
