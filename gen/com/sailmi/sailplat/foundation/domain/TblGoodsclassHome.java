package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsclass.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsclass
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsclassHome {

	private static final Log log = LogFactory.getLog(TblGoodsclassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsclass transientInstance) {
		log.debug("persisting TblGoodsclass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsclass persistentInstance) {
		log.debug("removing TblGoodsclass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsclass merge(TblGoodsclass detachedInstance) {
		log.debug("merging TblGoodsclass instance");
		try {
			TblGoodsclass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsclass findById(Long id) {
		log.debug("getting TblGoodsclass instance with id: " + id);
		try {
			TblGoodsclass instance = entityManager.find(TblGoodsclass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
