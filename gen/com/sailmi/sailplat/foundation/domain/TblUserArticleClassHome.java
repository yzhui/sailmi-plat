package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblUserArticleClass.
 * @see com.sailmi.sailplat.foundation.domain.TblUserArticleClass
 * @author Hibernate Tools
 */
@Stateless
public class TblUserArticleClassHome {

	private static final Log log = LogFactory.getLog(TblUserArticleClassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblUserArticleClass transientInstance) {
		log.debug("persisting TblUserArticleClass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblUserArticleClass persistentInstance) {
		log.debug("removing TblUserArticleClass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblUserArticleClass merge(TblUserArticleClass detachedInstance) {
		log.debug("merging TblUserArticleClass instance");
		try {
			TblUserArticleClass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblUserArticleClass findById(Long id) {
		log.debug("getting TblUserArticleClass instance with id: " + id);
		try {
			TblUserArticleClass instance = entityManager.find(TblUserArticleClass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
