package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblArticleHistory.
 * @see com.sailmi.sailplat.foundation.domain.TblArticleHistory
 * @author Hibernate Tools
 */
@Stateless
public class TblArticleHistoryHome {

	private static final Log log = LogFactory.getLog(TblArticleHistoryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblArticleHistory transientInstance) {
		log.debug("persisting TblArticleHistory instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblArticleHistory persistentInstance) {
		log.debug("removing TblArticleHistory instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblArticleHistory merge(TblArticleHistory detachedInstance) {
		log.debug("merging TblArticleHistory instance");
		try {
			TblArticleHistory result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblArticleHistory findById(Long id) {
		log.debug("getting TblArticleHistory instance with id: " + id);
		try {
			TblArticleHistory instance = entityManager.find(TblArticleHistory.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
