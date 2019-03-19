package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblEnterprise.
 * @see com.sailmi.sailplat.foundation.domain.TblEnterprise
 * @author Hibernate Tools
 */
@Stateless
public class TblEnterpriseHome {

	private static final Log log = LogFactory.getLog(TblEnterpriseHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblEnterprise transientInstance) {
		log.debug("persisting TblEnterprise instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblEnterprise persistentInstance) {
		log.debug("removing TblEnterprise instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblEnterprise merge(TblEnterprise detachedInstance) {
		log.debug("merging TblEnterprise instance");
		try {
			TblEnterprise result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblEnterprise findById(Integer id) {
		log.debug("getting TblEnterprise instance with id: " + id);
		try {
			TblEnterprise instance = entityManager.find(TblEnterprise.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
