package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblStorecart.
 * @see com.sailmi.sailplat.foundation.domain.TblStorecart
 * @author Hibernate Tools
 */
@Stateless
public class TblStorecartHome {

	private static final Log log = LogFactory.getLog(TblStorecartHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblStorecart transientInstance) {
		log.debug("persisting TblStorecart instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblStorecart persistentInstance) {
		log.debug("removing TblStorecart instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblStorecart merge(TblStorecart detachedInstance) {
		log.debug("merging TblStorecart instance");
		try {
			TblStorecart result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblStorecart findById(Long id) {
		log.debug("getting TblStorecart instance with id: " + id);
		try {
			TblStorecart instance = entityManager.find(TblStorecart.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
