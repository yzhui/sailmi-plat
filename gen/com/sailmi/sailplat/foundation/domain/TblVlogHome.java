package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblVlog.
 * @see com.sailmi.sailplat.foundation.domain.TblVlog
 * @author Hibernate Tools
 */
@Stateless
public class TblVlogHome {

	private static final Log log = LogFactory.getLog(TblVlogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblVlog transientInstance) {
		log.debug("persisting TblVlog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblVlog persistentInstance) {
		log.debug("removing TblVlog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblVlog merge(TblVlog detachedInstance) {
		log.debug("merging TblVlog instance");
		try {
			TblVlog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblVlog findById(Long id) {
		log.debug("getting TblVlog instance with id: " + id);
		try {
			TblVlog instance = entityManager.find(TblVlog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
