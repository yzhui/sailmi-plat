package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblConsult.
 * @see com.sailmi.sailplat.foundation.domain.TblConsult
 * @author Hibernate Tools
 */
@Stateless
public class TblConsultHome {

	private static final Log log = LogFactory.getLog(TblConsultHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblConsult transientInstance) {
		log.debug("persisting TblConsult instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblConsult persistentInstance) {
		log.debug("removing TblConsult instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblConsult merge(TblConsult detachedInstance) {
		log.debug("merging TblConsult instance");
		try {
			TblConsult result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblConsult findById(Long id) {
		log.debug("getting TblConsult instance with id: " + id);
		try {
			TblConsult instance = entityManager.find(TblConsult.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
