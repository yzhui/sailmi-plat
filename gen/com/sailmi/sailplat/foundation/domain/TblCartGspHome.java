package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblCartGsp.
 * @see com.sailmi.sailplat.foundation.domain.TblCartGsp
 * @author Hibernate Tools
 */
@Stateless
public class TblCartGspHome {

	private static final Log log = LogFactory.getLog(TblCartGspHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblCartGsp transientInstance) {
		log.debug("persisting TblCartGsp instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblCartGsp persistentInstance) {
		log.debug("removing TblCartGsp instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblCartGsp merge(TblCartGsp detachedInstance) {
		log.debug("merging TblCartGsp instance");
		try {
			TblCartGsp result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblCartGsp findById(TblCartGspId id) {
		log.debug("getting TblCartGsp instance with id: " + id);
		try {
			TblCartGsp instance = entityManager.find(TblCartGsp.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
