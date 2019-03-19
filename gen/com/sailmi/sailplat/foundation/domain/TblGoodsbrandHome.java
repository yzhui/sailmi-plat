package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsbrand.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsbrand
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsbrandHome {

	private static final Log log = LogFactory.getLog(TblGoodsbrandHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsbrand transientInstance) {
		log.debug("persisting TblGoodsbrand instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsbrand persistentInstance) {
		log.debug("removing TblGoodsbrand instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsbrand merge(TblGoodsbrand detachedInstance) {
		log.debug("merging TblGoodsbrand instance");
		try {
			TblGoodsbrand result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsbrand findById(Long id) {
		log.debug("getting TblGoodsbrand instance with id: " + id);
		try {
			TblGoodsbrand instance = entityManager.find(TblGoodsbrand.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
