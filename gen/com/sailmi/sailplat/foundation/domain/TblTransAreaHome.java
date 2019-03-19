package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblTransArea.
 * @see com.sailmi.sailplat.foundation.domain.TblTransArea
 * @author Hibernate Tools
 */
@Stateless
public class TblTransAreaHome {

	private static final Log log = LogFactory.getLog(TblTransAreaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblTransArea transientInstance) {
		log.debug("persisting TblTransArea instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblTransArea persistentInstance) {
		log.debug("removing TblTransArea instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblTransArea merge(TblTransArea detachedInstance) {
		log.debug("merging TblTransArea instance");
		try {
			TblTransArea result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblTransArea findById(Long id) {
		log.debug("getting TblTransArea instance with id: " + id);
		try {
			TblTransArea instance = entityManager.find(TblTransArea.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
