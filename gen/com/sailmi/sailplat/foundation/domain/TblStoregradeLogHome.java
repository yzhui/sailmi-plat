package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblStoregradeLog.
 * @see com.sailmi.sailplat.foundation.domain.TblStoregradeLog
 * @author Hibernate Tools
 */
@Stateless
public class TblStoregradeLogHome {

	private static final Log log = LogFactory.getLog(TblStoregradeLogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblStoregradeLog transientInstance) {
		log.debug("persisting TblStoregradeLog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblStoregradeLog persistentInstance) {
		log.debug("removing TblStoregradeLog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblStoregradeLog merge(TblStoregradeLog detachedInstance) {
		log.debug("merging TblStoregradeLog instance");
		try {
			TblStoregradeLog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblStoregradeLog findById(Long id) {
		log.debug("getting TblStoregradeLog instance with id: " + id);
		try {
			TblStoregradeLog instance = entityManager.find(TblStoregradeLog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
