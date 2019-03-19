package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblPredepositLog.
 * @see com.sailmi.sailplat.foundation.domain.TblPredepositLog
 * @author Hibernate Tools
 */
@Stateless
public class TblPredepositLogHome {

	private static final Log log = LogFactory.getLog(TblPredepositLogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblPredepositLog transientInstance) {
		log.debug("persisting TblPredepositLog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblPredepositLog persistentInstance) {
		log.debug("removing TblPredepositLog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblPredepositLog merge(TblPredepositLog detachedInstance) {
		log.debug("merging TblPredepositLog instance");
		try {
			TblPredepositLog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblPredepositLog findById(Long id) {
		log.debug("getting TblPredepositLog instance with id: " + id);
		try {
			TblPredepositLog instance = entityManager.find(TblPredepositLog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
