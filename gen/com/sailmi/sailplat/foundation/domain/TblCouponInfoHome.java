package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblCouponInfo.
 * @see com.sailmi.sailplat.foundation.domain.TblCouponInfo
 * @author Hibernate Tools
 */
@Stateless
public class TblCouponInfoHome {

	private static final Log log = LogFactory.getLog(TblCouponInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblCouponInfo transientInstance) {
		log.debug("persisting TblCouponInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblCouponInfo persistentInstance) {
		log.debug("removing TblCouponInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblCouponInfo merge(TblCouponInfo detachedInstance) {
		log.debug("merging TblCouponInfo instance");
		try {
			TblCouponInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblCouponInfo findById(Long id) {
		log.debug("getting TblCouponInfo instance with id: " + id);
		try {
			TblCouponInfo instance = entityManager.find(TblCouponInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
