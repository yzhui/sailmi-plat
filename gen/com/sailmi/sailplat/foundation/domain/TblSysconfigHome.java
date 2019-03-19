package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblSysconfig.
 * @see com.sailmi.sailplat.foundation.domain.TblSysconfig
 * @author Hibernate Tools
 */
@Stateless
public class TblSysconfigHome {

	private static final Log log = LogFactory.getLog(TblSysconfigHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblSysconfig transientInstance) {
		log.debug("persisting TblSysconfig instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblSysconfig persistentInstance) {
		log.debug("removing TblSysconfig instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblSysconfig merge(TblSysconfig detachedInstance) {
		log.debug("merging TblSysconfig instance");
		try {
			TblSysconfig result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblSysconfig findById(Long id) {
		log.debug("getting TblSysconfig instance with id: " + id);
		try {
			TblSysconfig instance = entityManager.find(TblSysconfig.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
