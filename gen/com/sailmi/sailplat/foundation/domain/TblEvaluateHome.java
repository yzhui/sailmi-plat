package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblEvaluate.
 * @see com.sailmi.sailplat.foundation.domain.TblEvaluate
 * @author Hibernate Tools
 */
@Stateless
public class TblEvaluateHome {

	private static final Log log = LogFactory.getLog(TblEvaluateHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblEvaluate transientInstance) {
		log.debug("persisting TblEvaluate instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblEvaluate persistentInstance) {
		log.debug("removing TblEvaluate instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblEvaluate merge(TblEvaluate detachedInstance) {
		log.debug("merging TblEvaluate instance");
		try {
			TblEvaluate result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblEvaluate findById(Long id) {
		log.debug("getting TblEvaluate instance with id: " + id);
		try {
			TblEvaluate instance = entityManager.find(TblEvaluate.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
