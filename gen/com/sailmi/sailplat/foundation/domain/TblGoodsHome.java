package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoods.
 * @see com.sailmi.sailplat.foundation.domain.TblGoods
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsHome {

	private static final Log log = LogFactory.getLog(TblGoodsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoods transientInstance) {
		log.debug("persisting TblGoods instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoods persistentInstance) {
		log.debug("removing TblGoods instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoods merge(TblGoods detachedInstance) {
		log.debug("merging TblGoods instance");
		try {
			TblGoods result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoods findById(Long id) {
		log.debug("getting TblGoods instance with id: " + id);
		try {
			TblGoods instance = entityManager.find(TblGoods.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
