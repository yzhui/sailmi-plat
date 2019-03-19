package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblDistrictsGoodsclass.
 * @see com.sailmi.sailplat.foundation.domain.TblDistrictsGoodsclass
 * @author Hibernate Tools
 */
@Stateless
public class TblDistrictsGoodsclassHome {

	private static final Log log = LogFactory.getLog(TblDistrictsGoodsclassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblDistrictsGoodsclass transientInstance) {
		log.debug("persisting TblDistrictsGoodsclass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblDistrictsGoodsclass persistentInstance) {
		log.debug("removing TblDistrictsGoodsclass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblDistrictsGoodsclass merge(TblDistrictsGoodsclass detachedInstance) {
		log.debug("merging TblDistrictsGoodsclass instance");
		try {
			TblDistrictsGoodsclass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblDistrictsGoodsclass findById(Long id) {
		log.debug("getting TblDistrictsGoodsclass instance with id: " + id);
		try {
			TblDistrictsGoodsclass instance = entityManager.find(TblDistrictsGoodsclass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
