package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblStoreclass.
 * @see com.sailmi.sailplat.foundation.domain.TblStoreclass
 * @author Hibernate Tools
 */
@Stateless
public class TblStoreclassHome {

	private static final Log log = LogFactory.getLog(TblStoreclassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblStoreclass transientInstance) {
		log.debug("persisting TblStoreclass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblStoreclass persistentInstance) {
		log.debug("removing TblStoreclass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblStoreclass merge(TblStoreclass detachedInstance) {
		log.debug("merging TblStoreclass instance");
		try {
			TblStoreclass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblStoreclass findById(Long id) {
		log.debug("getting TblStoreclass instance with id: " + id);
		try {
			TblStoreclass instance = entityManager.find(TblStoreclass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
