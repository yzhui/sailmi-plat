package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblHomepageGoodsclassLog.
 * @see com.sailmi.sailplat.foundation.domain.TblHomepageGoodsclassLog
 * @author Hibernate Tools
 */
@Stateless
public class TblHomepageGoodsclassLogHome {

	private static final Log log = LogFactory.getLog(TblHomepageGoodsclassLogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblHomepageGoodsclassLog transientInstance) {
		log.debug("persisting TblHomepageGoodsclassLog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblHomepageGoodsclassLog persistentInstance) {
		log.debug("removing TblHomepageGoodsclassLog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblHomepageGoodsclassLog merge(TblHomepageGoodsclassLog detachedInstance) {
		log.debug("merging TblHomepageGoodsclassLog instance");
		try {
			TblHomepageGoodsclassLog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblHomepageGoodsclassLog findById(Long id) {
		log.debug("getting TblHomepageGoodsclassLog instance with id: " + id);
		try {
			TblHomepageGoodsclassLog instance = entityManager.find(TblHomepageGoodsclassLog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
