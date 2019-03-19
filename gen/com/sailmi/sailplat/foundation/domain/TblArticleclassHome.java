package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblArticleclass.
 * @see com.sailmi.sailplat.foundation.domain.TblArticleclass
 * @author Hibernate Tools
 */
@Stateless
public class TblArticleclassHome {

	private static final Log log = LogFactory.getLog(TblArticleclassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblArticleclass transientInstance) {
		log.debug("persisting TblArticleclass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblArticleclass persistentInstance) {
		log.debug("removing TblArticleclass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblArticleclass merge(TblArticleclass detachedInstance) {
		log.debug("merging TblArticleclass instance");
		try {
			TblArticleclass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblArticleclass findById(Long id) {
		log.debug("getting TblArticleclass instance with id: " + id);
		try {
			TblArticleclass instance = entityManager.find(TblArticleclass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
