package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblUserArticle.
 * @see com.sailmi.sailplat.foundation.domain.TblUserArticle
 * @author Hibernate Tools
 */
@Stateless
public class TblUserArticleHome {

	private static final Log log = LogFactory.getLog(TblUserArticleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblUserArticle transientInstance) {
		log.debug("persisting TblUserArticle instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblUserArticle persistentInstance) {
		log.debug("removing TblUserArticle instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblUserArticle merge(TblUserArticle detachedInstance) {
		log.debug("merging TblUserArticle instance");
		try {
			TblUserArticle result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblUserArticle findById(Long id) {
		log.debug("getting TblUserArticle instance with id: " + id);
		try {
			TblUserArticle instance = entityManager.find(TblUserArticle.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
