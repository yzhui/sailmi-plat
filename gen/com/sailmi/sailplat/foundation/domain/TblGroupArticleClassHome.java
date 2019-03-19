package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGroupArticleClass.
 * @see com.sailmi.sailplat.foundation.domain.TblGroupArticleClass
 * @author Hibernate Tools
 */
@Stateless
public class TblGroupArticleClassHome {

	private static final Log log = LogFactory.getLog(TblGroupArticleClassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGroupArticleClass transientInstance) {
		log.debug("persisting TblGroupArticleClass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGroupArticleClass persistentInstance) {
		log.debug("removing TblGroupArticleClass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGroupArticleClass merge(TblGroupArticleClass detachedInstance) {
		log.debug("merging TblGroupArticleClass instance");
		try {
			TblGroupArticleClass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGroupArticleClass findById(Long id) {
		log.debug("getting TblGroupArticleClass instance with id: " + id);
		try {
			TblGroupArticleClass instance = entityManager.find(TblGroupArticleClass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
