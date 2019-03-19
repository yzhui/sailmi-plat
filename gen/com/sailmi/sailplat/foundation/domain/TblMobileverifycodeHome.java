package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblMobileverifycode.
 * @see com.sailmi.sailplat.foundation.domain.TblMobileverifycode
 * @author Hibernate Tools
 */
@Stateless
public class TblMobileverifycodeHome {

	private static final Log log = LogFactory.getLog(TblMobileverifycodeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblMobileverifycode transientInstance) {
		log.debug("persisting TblMobileverifycode instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblMobileverifycode persistentInstance) {
		log.debug("removing TblMobileverifycode instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblMobileverifycode merge(TblMobileverifycode detachedInstance) {
		log.debug("merging TblMobileverifycode instance");
		try {
			TblMobileverifycode result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblMobileverifycode findById(Long id) {
		log.debug("getting TblMobileverifycode instance with id: " + id);
		try {
			TblMobileverifycode instance = entityManager.find(TblMobileverifycode.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
