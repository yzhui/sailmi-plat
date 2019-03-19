package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsReturnlog.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsReturnlog
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsReturnlogHome {

	private static final Log log = LogFactory.getLog(TblGoodsReturnlogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsReturnlog transientInstance) {
		log.debug("persisting TblGoodsReturnlog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsReturnlog persistentInstance) {
		log.debug("removing TblGoodsReturnlog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsReturnlog merge(TblGoodsReturnlog detachedInstance) {
		log.debug("merging TblGoodsReturnlog instance");
		try {
			TblGoodsReturnlog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsReturnlog findById(Long id) {
		log.debug("getting TblGoodsReturnlog instance with id: " + id);
		try {
			TblGoodsReturnlog instance = entityManager.find(TblGoodsReturnlog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
