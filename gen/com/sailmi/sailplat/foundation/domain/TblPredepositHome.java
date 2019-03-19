package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblPredeposit.
 * @see com.sailmi.sailplat.foundation.domain.TblPredeposit
 * @author Hibernate Tools
 */
@Stateless
public class TblPredepositHome {

	private static final Log log = LogFactory.getLog(TblPredepositHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblPredeposit transientInstance) {
		log.debug("persisting TblPredeposit instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblPredeposit persistentInstance) {
		log.debug("removing TblPredeposit instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblPredeposit merge(TblPredeposit detachedInstance) {
		log.debug("merging TblPredeposit instance");
		try {
			TblPredeposit result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblPredeposit findById(Long id) {
		log.debug("getting TblPredeposit instance with id: " + id);
		try {
			TblPredeposit instance = entityManager.find(TblPredeposit.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
