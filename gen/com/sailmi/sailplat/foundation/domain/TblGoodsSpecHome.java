package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsSpec.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsSpec
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsSpecHome {

	private static final Log log = LogFactory.getLog(TblGoodsSpecHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsSpec transientInstance) {
		log.debug("persisting TblGoodsSpec instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsSpec persistentInstance) {
		log.debug("removing TblGoodsSpec instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsSpec merge(TblGoodsSpec detachedInstance) {
		log.debug("merging TblGoodsSpec instance");
		try {
			TblGoodsSpec result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsSpec findById(TblGoodsSpecId id) {
		log.debug("getting TblGoodsSpec instance with id: " + id);
		try {
			TblGoodsSpec instance = entityManager.find(TblGoodsSpec.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
