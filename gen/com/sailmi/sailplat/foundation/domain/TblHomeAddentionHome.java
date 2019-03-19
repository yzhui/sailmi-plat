package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblHomeAddention.
 * @see com.sailmi.sailplat.foundation.domain.TblHomeAddention
 * @author Hibernate Tools
 */
@Stateless
public class TblHomeAddentionHome {

	private static final Log log = LogFactory.getLog(TblHomeAddentionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblHomeAddention transientInstance) {
		log.debug("persisting TblHomeAddention instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblHomeAddention persistentInstance) {
		log.debug("removing TblHomeAddention instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblHomeAddention merge(TblHomeAddention detachedInstance) {
		log.debug("merging TblHomeAddention instance");
		try {
			TblHomeAddention result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblHomeAddention findById(Long id) {
		log.debug("getting TblHomeAddention instance with id: " + id);
		try {
			TblHomeAddention instance = entityManager.find(TblHomeAddention.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
