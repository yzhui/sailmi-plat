package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblShipping.
 * @see com.sailmi.sailplat.foundation.domain.TblShipping
 * @author Hibernate Tools
 */
@Stateless
public class TblShippingHome {

	private static final Log log = LogFactory.getLog(TblShippingHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblShipping transientInstance) {
		log.debug("persisting TblShipping instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblShipping persistentInstance) {
		log.debug("removing TblShipping instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblShipping merge(TblShipping detachedInstance) {
		log.debug("merging TblShipping instance");
		try {
			TblShipping result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblShipping findById(Long id) {
		log.debug("getting TblShipping instance with id: " + id);
		try {
			TblShipping instance = entityManager.find(TblShipping.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
