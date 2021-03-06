package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblAccessory.
 * @see com.sailmi.sailplat.foundation.domain.TblAccessory
 * @author Hibernate Tools
 */
@Stateless
public class TblAccessoryHome {

	private static final Log log = LogFactory.getLog(TblAccessoryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblAccessory transientInstance) {
		log.debug("persisting TblAccessory instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblAccessory persistentInstance) {
		log.debug("removing TblAccessory instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblAccessory merge(TblAccessory detachedInstance) {
		log.debug("merging TblAccessory instance");
		try {
			TblAccessory result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblAccessory findById(Long id) {
		log.debug("getting TblAccessory instance with id: " + id);
		try {
			TblAccessory instance = entityManager.find(TblAccessory.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
