package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodstypeproperty.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodstypeproperty
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodstypepropertyHome {

	private static final Log log = LogFactory.getLog(TblGoodstypepropertyHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodstypeproperty transientInstance) {
		log.debug("persisting TblGoodstypeproperty instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodstypeproperty persistentInstance) {
		log.debug("removing TblGoodstypeproperty instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodstypeproperty merge(TblGoodstypeproperty detachedInstance) {
		log.debug("merging TblGoodstypeproperty instance");
		try {
			TblGoodstypeproperty result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodstypeproperty findById(Long id) {
		log.debug("getting TblGoodstypeproperty instance with id: " + id);
		try {
			TblGoodstypeproperty instance = entityManager.find(TblGoodstypeproperty.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
