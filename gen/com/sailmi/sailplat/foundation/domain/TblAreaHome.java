package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblArea.
 * @see com.sailmi.sailplat.foundation.domain.TblArea
 * @author Hibernate Tools
 */
@Stateless
public class TblAreaHome {

	private static final Log log = LogFactory.getLog(TblAreaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblArea transientInstance) {
		log.debug("persisting TblArea instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblArea persistentInstance) {
		log.debug("removing TblArea instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblArea merge(TblArea detachedInstance) {
		log.debug("merging TblArea instance");
		try {
			TblArea result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblArea findById(Long id) {
		log.debug("getting TblArea instance with id: " + id);
		try {
			TblArea instance = entityManager.find(TblArea.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
