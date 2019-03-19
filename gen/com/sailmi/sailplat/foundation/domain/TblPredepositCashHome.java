package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblPredepositCash.
 * @see com.sailmi.sailplat.foundation.domain.TblPredepositCash
 * @author Hibernate Tools
 */
@Stateless
public class TblPredepositCashHome {

	private static final Log log = LogFactory.getLog(TblPredepositCashHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblPredepositCash transientInstance) {
		log.debug("persisting TblPredepositCash instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblPredepositCash persistentInstance) {
		log.debug("removing TblPredepositCash instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblPredepositCash merge(TblPredepositCash detachedInstance) {
		log.debug("merging TblPredepositCash instance");
		try {
			TblPredepositCash result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblPredepositCash findById(Long id) {
		log.debug("getting TblPredepositCash instance with id: " + id);
		try {
			TblPredepositCash instance = entityManager.find(TblPredepositCash.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
