package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblSpareGoodsfloor.
 * @see com.sailmi.sailplat.foundation.domain.TblSpareGoodsfloor
 * @author Hibernate Tools
 */
@Stateless
public class TblSpareGoodsfloorHome {

	private static final Log log = LogFactory.getLog(TblSpareGoodsfloorHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblSpareGoodsfloor transientInstance) {
		log.debug("persisting TblSpareGoodsfloor instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblSpareGoodsfloor persistentInstance) {
		log.debug("removing TblSpareGoodsfloor instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblSpareGoodsfloor merge(TblSpareGoodsfloor detachedInstance) {
		log.debug("merging TblSpareGoodsfloor instance");
		try {
			TblSpareGoodsfloor result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblSpareGoodsfloor findById(Long id) {
		log.debug("getting TblSpareGoodsfloor instance with id: " + id);
		try {
			TblSpareGoodsfloor instance = entityManager.find(TblSpareGoodsfloor.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
