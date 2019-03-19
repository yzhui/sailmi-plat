package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblAdvPos.
 * @see com.sailmi.sailplat.foundation.domain.TblAdvPos
 * @author Hibernate Tools
 */
@Stateless
public class TblAdvPosHome {

	private static final Log log = LogFactory.getLog(TblAdvPosHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblAdvPos transientInstance) {
		log.debug("persisting TblAdvPos instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblAdvPos persistentInstance) {
		log.debug("removing TblAdvPos instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblAdvPos merge(TblAdvPos detachedInstance) {
		log.debug("merging TblAdvPos instance");
		try {
			TblAdvPos result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblAdvPos findById(Long id) {
		log.debug("getting TblAdvPos instance with id: " + id);
		try {
			TblAdvPos instance = entityManager.find(TblAdvPos.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
