package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblUsergoodsclass.
 * @see com.sailmi.sailplat.foundation.domain.TblUsergoodsclass
 * @author Hibernate Tools
 */
@Stateless
public class TblUsergoodsclassHome {

	private static final Log log = LogFactory.getLog(TblUsergoodsclassHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblUsergoodsclass transientInstance) {
		log.debug("persisting TblUsergoodsclass instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblUsergoodsclass persistentInstance) {
		log.debug("removing TblUsergoodsclass instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblUsergoodsclass merge(TblUsergoodsclass detachedInstance) {
		log.debug("merging TblUsergoodsclass instance");
		try {
			TblUsergoodsclass result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblUsergoodsclass findById(Long id) {
		log.debug("getting TblUsergoodsclass instance with id: " + id);
		try {
			TblUsergoodsclass instance = entityManager.find(TblUsergoodsclass.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
