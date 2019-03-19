package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodstypeSpec.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodstypeSpec
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodstypeSpecHome {

	private static final Log log = LogFactory.getLog(TblGoodstypeSpecHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodstypeSpec transientInstance) {
		log.debug("persisting TblGoodstypeSpec instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodstypeSpec persistentInstance) {
		log.debug("removing TblGoodstypeSpec instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodstypeSpec merge(TblGoodstypeSpec detachedInstance) {
		log.debug("merging TblGoodstypeSpec instance");
		try {
			TblGoodstypeSpec result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodstypeSpec findById(TblGoodstypeSpecId id) {
		log.debug("getting TblGoodstypeSpec instance with id: " + id);
		try {
			TblGoodstypeSpec instance = entityManager.find(TblGoodstypeSpec.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
