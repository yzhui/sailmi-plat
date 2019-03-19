package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblIntegralGoodsorder.
 * @see com.sailmi.sailplat.foundation.domain.TblIntegralGoodsorder
 * @author Hibernate Tools
 */
@Stateless
public class TblIntegralGoodsorderHome {

	private static final Log log = LogFactory.getLog(TblIntegralGoodsorderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblIntegralGoodsorder transientInstance) {
		log.debug("persisting TblIntegralGoodsorder instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblIntegralGoodsorder persistentInstance) {
		log.debug("removing TblIntegralGoodsorder instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblIntegralGoodsorder merge(TblIntegralGoodsorder detachedInstance) {
		log.debug("merging TblIntegralGoodsorder instance");
		try {
			TblIntegralGoodsorder result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblIntegralGoodsorder findById(Long id) {
		log.debug("getting TblIntegralGoodsorder instance with id: " + id);
		try {
			TblIntegralGoodsorder instance = entityManager.find(TblIntegralGoodsorder.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
