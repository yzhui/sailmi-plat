package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGroupArea.
 * @see com.sailmi.sailplat.foundation.domain.TblGroupArea
 * @author Hibernate Tools
 */
@Stateless
public class TblGroupAreaHome {

	private static final Log log = LogFactory.getLog(TblGroupAreaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGroupArea transientInstance) {
		log.debug("persisting TblGroupArea instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGroupArea persistentInstance) {
		log.debug("removing TblGroupArea instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGroupArea merge(TblGroupArea detachedInstance) {
		log.debug("merging TblGroupArea instance");
		try {
			TblGroupArea result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGroupArea findById(Long id) {
		log.debug("getting TblGroupArea instance with id: " + id);
		try {
			TblGroupArea instance = entityManager.find(TblGroupArea.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
