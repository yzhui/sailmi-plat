package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsReturnitem.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsReturnitem
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsReturnitemHome {

	private static final Log log = LogFactory.getLog(TblGoodsReturnitemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsReturnitem transientInstance) {
		log.debug("persisting TblGoodsReturnitem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsReturnitem persistentInstance) {
		log.debug("removing TblGoodsReturnitem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsReturnitem merge(TblGoodsReturnitem detachedInstance) {
		log.debug("merging TblGoodsReturnitem instance");
		try {
			TblGoodsReturnitem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsReturnitem findById(Long id) {
		log.debug("getting TblGoodsReturnitem instance with id: " + id);
		try {
			TblGoodsReturnitem instance = entityManager.find(TblGoodsReturnitem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
