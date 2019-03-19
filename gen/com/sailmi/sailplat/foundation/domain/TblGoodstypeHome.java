package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodstype.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodstype
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodstypeHome {

	private static final Log log = LogFactory.getLog(TblGoodstypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodstype transientInstance) {
		log.debug("persisting TblGoodstype instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodstype persistentInstance) {
		log.debug("removing TblGoodstype instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodstype merge(TblGoodstype detachedInstance) {
		log.debug("merging TblGoodstype instance");
		try {
			TblGoodstype result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodstype findById(Long id) {
		log.debug("getting TblGoodstype instance with id: " + id);
		try {
			TblGoodstype instance = entityManager.find(TblGoodstype.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
