package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderform.
 * @see com.sailmi.sailplat.foundation.domain.TblOrderform
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderformHome {

	private static final Log log = LogFactory.getLog(TblOrderformHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderform transientInstance) {
		log.debug("persisting TblOrderform instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderform persistentInstance) {
		log.debug("removing TblOrderform instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderform merge(TblOrderform detachedInstance) {
		log.debug("merging TblOrderform instance");
		try {
			TblOrderform result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderform findById(Long id) {
		log.debug("getting TblOrderform instance with id: " + id);
		try {
			TblOrderform instance = entityManager.find(TblOrderform.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
