package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblUserconfig.
 * @see com.sailmi.sailplat.foundation.domain.TblUserconfig
 * @author Hibernate Tools
 */
@Stateless
public class TblUserconfigHome {

	private static final Log log = LogFactory.getLog(TblUserconfigHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblUserconfig transientInstance) {
		log.debug("persisting TblUserconfig instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblUserconfig persistentInstance) {
		log.debug("removing TblUserconfig instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblUserconfig merge(TblUserconfig detachedInstance) {
		log.debug("merging TblUserconfig instance");
		try {
			TblUserconfig result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblUserconfig findById(Long id) {
		log.debug("getting TblUserconfig instance with id: " + id);
		try {
			TblUserconfig instance = entityManager.find(TblUserconfig.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
