package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsclassstaple.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsclassstaple
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsclassstapleHome {

	private static final Log log = LogFactory.getLog(TblGoodsclassstapleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsclassstaple transientInstance) {
		log.debug("persisting TblGoodsclassstaple instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsclassstaple persistentInstance) {
		log.debug("removing TblGoodsclassstaple instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsclassstaple merge(TblGoodsclassstaple detachedInstance) {
		log.debug("merging TblGoodsclassstaple instance");
		try {
			TblGoodsclassstaple result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsclassstaple findById(Long id) {
		log.debug("getting TblGoodsclassstaple instance with id: " + id);
		try {
			TblGoodsclassstaple instance = entityManager.find(TblGoodsclassstaple.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
