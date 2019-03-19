package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGroupArticle.
 * @see com.sailmi.sailplat.foundation.domain.TblGroupArticle
 * @author Hibernate Tools
 */
@Stateless
public class TblGroupArticleHome {

	private static final Log log = LogFactory.getLog(TblGroupArticleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGroupArticle transientInstance) {
		log.debug("persisting TblGroupArticle instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGroupArticle persistentInstance) {
		log.debug("removing TblGroupArticle instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGroupArticle merge(TblGroupArticle detachedInstance) {
		log.debug("merging TblGroupArticle instance");
		try {
			TblGroupArticle result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGroupArticle findById(Long id) {
		log.debug("getting TblGroupArticle instance with id: " + id);
		try {
			TblGroupArticle instance = entityManager.find(TblGroupArticle.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
