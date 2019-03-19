package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsclassArticleClass.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsclassArticleClass
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsclassArticleClassHome {

	private static final Log log = LogFactory.getLog(TblGoodsclassArticleClassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsclassArticleClass transientInstance) {
		log.debug("persisting TblGoodsclassArticleClass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsclassArticleClass persistentInstance) {
		log.debug("removing TblGoodsclassArticleClass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsclassArticleClass merge(TblGoodsclassArticleClass detachedInstance) {
		log.debug("merging TblGoodsclassArticleClass instance");
		try {
			TblGoodsclassArticleClass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsclassArticleClass findById(Long id) {
		log.debug("getting TblGoodsclassArticleClass instance with id: " + id);
		try {
			TblGoodsclassArticleClass instance = entityManager.find(TblGoodsclassArticleClass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
