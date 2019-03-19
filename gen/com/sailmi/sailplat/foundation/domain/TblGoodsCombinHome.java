package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsCombin.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsCombin
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsCombinHome {

	private static final Log log = LogFactory.getLog(TblGoodsCombinHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsCombin transientInstance) {
		log.debug("persisting TblGoodsCombin instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsCombin persistentInstance) {
		log.debug("removing TblGoodsCombin instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsCombin merge(TblGoodsCombin detachedInstance) {
		log.debug("merging TblGoodsCombin instance");
		try {
			TblGoodsCombin result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsCombin findById(TblGoodsCombinId id) {
		log.debug("getting TblGoodsCombin instance with id: " + id);
		try {
			TblGoodsCombin instance = entityManager.find(TblGoodsCombin.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
