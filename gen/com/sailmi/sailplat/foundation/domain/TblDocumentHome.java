package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblDocument.
 * @see com.sailmi.sailplat.foundation.domain.TblDocument
 * @author Hibernate Tools
 */
@Stateless
public class TblDocumentHome {

	private static final Log log = LogFactory.getLog(TblDocumentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblDocument transientInstance) {
		log.debug("persisting TblDocument instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblDocument persistentInstance) {
		log.debug("removing TblDocument instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblDocument merge(TblDocument detachedInstance) {
		log.debug("merging TblDocument instance");
		try {
			TblDocument result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblDocument findById(Long id) {
		log.debug("getting TblDocument instance with id: " + id);
		try {
			TblDocument instance = entityManager.find(TblDocument.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
