package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsFloor.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsFloor
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsFloorHome {

	private static final Log log = LogFactory.getLog(TblGoodsFloorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsFloor transientInstance) {
		log.debug("persisting TblGoodsFloor instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsFloor persistentInstance) {
		log.debug("removing TblGoodsFloor instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsFloor merge(TblGoodsFloor detachedInstance) {
		log.debug("merging TblGoodsFloor instance");
		try {
			TblGoodsFloor result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsFloor findById(Long id) {
		log.debug("getting TblGoodsFloor instance with id: " + id);
		try {
			TblGoodsFloor instance = entityManager.find(TblGoodsFloor.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
