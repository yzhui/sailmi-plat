package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsArticle.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsArticle
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsArticleHome {

	private static final Log log = LogFactory.getLog(TblGoodsArticleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsArticle transientInstance) {
		log.debug("persisting TblGoodsArticle instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsArticle persistentInstance) {
		log.debug("removing TblGoodsArticle instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsArticle merge(TblGoodsArticle detachedInstance) {
		log.debug("merging TblGoodsArticle instance");
		try {
			TblGoodsArticle result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsArticle findById(Long id) {
		log.debug("getting TblGoodsArticle instance with id: " + id);
		try {
			TblGoodsArticle instance = entityManager.find(TblGoodsArticle.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
