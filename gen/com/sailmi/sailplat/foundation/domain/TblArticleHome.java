package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblArticle.
 * @see com.sailmi.sailplat.foundation.domain.TblArticle
 * @author Hibernate Tools
 */
@Stateless
public class TblArticleHome {

	private static final Log log = LogFactory.getLog(TblArticleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblArticle transientInstance) {
		log.debug("persisting TblArticle instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblArticle persistentInstance) {
		log.debug("removing TblArticle instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblArticle merge(TblArticle detachedInstance) {
		log.debug("merging TblArticle instance");
		try {
			TblArticle result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblArticle findById(Long id) {
		log.debug("getting TblArticle instance with id: " + id);
		try {
			TblArticle instance = entityManager.find(TblArticle.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
