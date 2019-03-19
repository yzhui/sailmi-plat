package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblSpareGoods.
 * @see com.sailmi.sailplat.foundation.domain.TblSpareGoods
 * @author Hibernate Tools
 */
@Stateless
public class TblSpareGoodsHome {

	private static final Log log = LogFactory.getLog(TblSpareGoodsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblSpareGoods transientInstance) {
		log.debug("persisting TblSpareGoods instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblSpareGoods persistentInstance) {
		log.debug("removing TblSpareGoods instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblSpareGoods merge(TblSpareGoods detachedInstance) {
		log.debug("merging TblSpareGoods instance");
		try {
			TblSpareGoods result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblSpareGoods findById(Long id) {
		log.debug("getting TblSpareGoods instance with id: " + id);
		try {
			TblSpareGoods instance = entityManager.find(TblSpareGoods.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
