package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblBargainGoods.
 * @see com.sailmi.sailplat.foundation.domain.TblBargainGoods
 * @author Hibernate Tools
 */
@Stateless
public class TblBargainGoodsHome {

	private static final Log log = LogFactory.getLog(TblBargainGoodsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblBargainGoods transientInstance) {
		log.debug("persisting TblBargainGoods instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblBargainGoods persistentInstance) {
		log.debug("removing TblBargainGoods instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblBargainGoods merge(TblBargainGoods detachedInstance) {
		log.debug("merging TblBargainGoods instance");
		try {
			TblBargainGoods result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblBargainGoods findById(Long id) {
		log.debug("getting TblBargainGoods instance with id: " + id);
		try {
			TblBargainGoods instance = entityManager.find(TblBargainGoods.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
