package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGroupClass.
 * @see com.sailmi.sailplat.foundation.domain.TblGroupClass
 * @author Hibernate Tools
 */
@Stateless
public class TblGroupClassHome {

	private static final Log log = LogFactory.getLog(TblGroupClassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGroupClass transientInstance) {
		log.debug("persisting TblGroupClass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGroupClass persistentInstance) {
		log.debug("removing TblGroupClass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGroupClass merge(TblGroupClass detachedInstance) {
		log.debug("merging TblGroupClass instance");
		try {
			TblGroupClass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGroupClass findById(Long id) {
		log.debug("getting TblGroupClass instance with id: " + id);
		try {
			TblGroupClass instance = entityManager.find(TblGroupClass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
