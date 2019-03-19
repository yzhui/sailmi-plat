package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblHomepageGoodsclass.
 * @see com.sailmi.sailplat.foundation.domain.TblHomepageGoodsclass
 * @author Hibernate Tools
 */
@Stateless
public class TblHomepageGoodsclassHome {

	private static final Log log = LogFactory.getLog(TblHomepageGoodsclassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblHomepageGoodsclass transientInstance) {
		log.debug("persisting TblHomepageGoodsclass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblHomepageGoodsclass persistentInstance) {
		log.debug("removing TblHomepageGoodsclass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblHomepageGoodsclass merge(TblHomepageGoodsclass detachedInstance) {
		log.debug("merging TblHomepageGoodsclass instance");
		try {
			TblHomepageGoodsclass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblHomepageGoodsclass findById(Long id) {
		log.debug("getting TblHomepageGoodsclass instance with id: " + id);
		try {
			TblHomepageGoodsclass instance = entityManager.find(TblHomepageGoodsclass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
