package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblComplaintGoods.
 * @see com.sailmi.sailplat.foundation.domain.TblComplaintGoods
 * @author Hibernate Tools
 */
@Stateless
public class TblComplaintGoodsHome {

	private static final Log log = LogFactory.getLog(TblComplaintGoodsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblComplaintGoods transientInstance) {
		log.debug("persisting TblComplaintGoods instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblComplaintGoods persistentInstance) {
		log.debug("removing TblComplaintGoods instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblComplaintGoods merge(TblComplaintGoods detachedInstance) {
		log.debug("merging TblComplaintGoods instance");
		try {
			TblComplaintGoods result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblComplaintGoods findById(Long id) {
		log.debug("getting TblComplaintGoods instance with id: " + id);
		try {
			TblComplaintGoods instance = entityManager.find(TblComplaintGoods.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
