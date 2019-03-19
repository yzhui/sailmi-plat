package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblRes.
 * @see com.sailmi.sailplat.foundation.domain.TblRes
 * @author Hibernate Tools
 */
@Stateless
public class TblResHome {

	private static final Log log = LogFactory.getLog(TblResHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblRes transientInstance) {
		log.debug("persisting TblRes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblRes persistentInstance) {
		log.debug("removing TblRes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblRes merge(TblRes detachedInstance) {
		log.debug("merging TblRes instance");
		try {
			TblRes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblRes findById(Long id) {
		log.debug("getting TblRes instance with id: " + id);
		try {
			TblRes instance = entityManager.find(TblRes.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
