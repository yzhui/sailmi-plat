package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblArticleComments.
 * @see com.sailmi.sailplat.foundation.domain.TblArticleComments
 * @author Hibernate Tools
 */
@Stateless
public class TblArticleCommentsHome {

	private static final Log log = LogFactory.getLog(TblArticleCommentsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblArticleComments transientInstance) {
		log.debug("persisting TblArticleComments instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblArticleComments persistentInstance) {
		log.debug("removing TblArticleComments instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblArticleComments merge(TblArticleComments detachedInstance) {
		log.debug("merging TblArticleComments instance");
		try {
			TblArticleComments result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblArticleComments findById(Long id) {
		log.debug("getting TblArticleComments instance with id: " + id);
		try {
			TblArticleComments instance = entityManager.find(TblArticleComments.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
