package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsclassArticle.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsclassArticle
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsclassArticleHome {

	private static final Log log = LogFactory.getLog(TblGoodsclassArticleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsclassArticle transientInstance) {
		log.debug("persisting TblGoodsclassArticle instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsclassArticle persistentInstance) {
		log.debug("removing TblGoodsclassArticle instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsclassArticle merge(TblGoodsclassArticle detachedInstance) {
		log.debug("merging TblGoodsclassArticle instance");
		try {
			TblGoodsclassArticle result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsclassArticle findById(Long id) {
		log.debug("getting TblGoodsclassArticle instance with id: " + id);
		try {
			TblGoodsclassArticle instance = entityManager.find(TblGoodsclassArticle.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
