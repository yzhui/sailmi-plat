package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblDistrictsArticle.
 * @see com.sailmi.sailplat.foundation.domain.TblDistrictsArticle
 * @author Hibernate Tools
 */
@Stateless
public class TblDistrictsArticleHome {

	private static final Log log = LogFactory.getLog(TblDistrictsArticleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblDistrictsArticle transientInstance) {
		log.debug("persisting TblDistrictsArticle instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblDistrictsArticle persistentInstance) {
		log.debug("removing TblDistrictsArticle instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblDistrictsArticle merge(TblDistrictsArticle detachedInstance) {
		log.debug("merging TblDistrictsArticle instance");
		try {
			TblDistrictsArticle result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblDistrictsArticle findById(Long id) {
		log.debug("getting TblDistrictsArticle instance with id: " + id);
		try {
			TblDistrictsArticle instance = entityManager.find(TblDistrictsArticle.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
