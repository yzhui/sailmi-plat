package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodstypeBrand.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodstypeBrand
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodstypeBrandHome {

	private static final Log log = LogFactory.getLog(TblGoodstypeBrandHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodstypeBrand transientInstance) {
		log.debug("persisting TblGoodstypeBrand instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodstypeBrand persistentInstance) {
		log.debug("removing TblGoodstypeBrand instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodstypeBrand merge(TblGoodstypeBrand detachedInstance) {
		log.debug("merging TblGoodstypeBrand instance");
		try {
			TblGoodstypeBrand result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodstypeBrand findById(TblGoodstypeBrandId id) {
		log.debug("getting TblGoodstypeBrand instance with id: " + id);
		try {
			TblGoodstypeBrand instance = entityManager.find(TblGoodstypeBrand.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
