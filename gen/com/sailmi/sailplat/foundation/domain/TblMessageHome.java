package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblMessage.
 * @see com.sailmi.sailplat.foundation.domain.TblMessage
 * @author Hibernate Tools
 */
@Stateless
public class TblMessageHome {

	private static final Log log = LogFactory.getLog(TblMessageHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblMessage transientInstance) {
		log.debug("persisting TblMessage instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblMessage persistentInstance) {
		log.debug("removing TblMessage instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblMessage merge(TblMessage detachedInstance) {
		log.debug("merging TblMessage instance");
		try {
			TblMessage result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblMessage findById(Long id) {
		log.debug("getting TblMessage instance with id: " + id);
		try {
			TblMessage instance = entityManager.find(TblMessage.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
