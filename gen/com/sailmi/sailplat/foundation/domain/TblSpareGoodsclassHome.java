package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblSpareGoodsclass.
 * @see com.sailmi.sailplat.foundation.domain.TblSpareGoodsclass
 * @author Hibernate Tools
 */
@Stateless
public class TblSpareGoodsclassHome {

	private static final Log log = LogFactory.getLog(TblSpareGoodsclassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblSpareGoodsclass transientInstance) {
		log.debug("persisting TblSpareGoodsclass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblSpareGoodsclass persistentInstance) {
		log.debug("removing TblSpareGoodsclass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblSpareGoodsclass merge(TblSpareGoodsclass detachedInstance) {
		log.debug("merging TblSpareGoodsclass instance");
		try {
			TblSpareGoodsclass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblSpareGoodsclass findById(Long id) {
		log.debug("getting TblSpareGoodsclass instance with id: " + id);
		try {
			TblSpareGoodsclass instance = entityManager.find(TblSpareGoodsclass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
