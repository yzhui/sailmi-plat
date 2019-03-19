package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsUgc.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsUgc
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsUgcHome {

	private static final Log log = LogFactory.getLog(TblGoodsUgcHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsUgc transientInstance) {
		log.debug("persisting TblGoodsUgc instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsUgc persistentInstance) {
		log.debug("removing TblGoodsUgc instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsUgc merge(TblGoodsUgc detachedInstance) {
		log.debug("merging TblGoodsUgc instance");
		try {
			TblGoodsUgc result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsUgc findById(TblGoodsUgcId id) {
		log.debug("getting TblGoodsUgc instance with id: " + id);
		try {
			TblGoodsUgc instance = entityManager.find(TblGoodsUgc.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
