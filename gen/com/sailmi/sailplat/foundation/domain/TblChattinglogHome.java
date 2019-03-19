package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblChattinglog.
 * @see com.sailmi.sailplat.foundation.domain.TblChattinglog
 * @author Hibernate Tools
 */
@Stateless
public class TblChattinglogHome {

	private static final Log log = LogFactory.getLog(TblChattinglogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblChattinglog transientInstance) {
		log.debug("persisting TblChattinglog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblChattinglog persistentInstance) {
		log.debug("removing TblChattinglog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblChattinglog merge(TblChattinglog detachedInstance) {
		log.debug("merging TblChattinglog instance");
		try {
			TblChattinglog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblChattinglog findById(Long id) {
		log.debug("getting TblChattinglog instance with id: " + id);
		try {
			TblChattinglog instance = entityManager.find(TblChattinglog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
