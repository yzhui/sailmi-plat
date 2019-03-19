package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblTransport.
 * @see com.sailmi.sailplat.foundation.domain.TblTransport
 * @author Hibernate Tools
 */
@Stateless
public class TblTransportHome {

	private static final Log log = LogFactory.getLog(TblTransportHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblTransport transientInstance) {
		log.debug("persisting TblTransport instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblTransport persistentInstance) {
		log.debug("removing TblTransport instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblTransport merge(TblTransport detachedInstance) {
		log.debug("merging TblTransport instance");
		try {
			TblTransport result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblTransport findById(Long id) {
		log.debug("getting TblTransport instance with id: " + id);
		try {
			TblTransport instance = entityManager.find(TblTransport.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
