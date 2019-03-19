package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblZtcGoldLog.
 * @see com.sailmi.sailplat.foundation.domain.TblZtcGoldLog
 * @author Hibernate Tools
 */
@Stateless
public class TblZtcGoldLogHome {

	private static final Log log = LogFactory.getLog(TblZtcGoldLogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblZtcGoldLog transientInstance) {
		log.debug("persisting TblZtcGoldLog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblZtcGoldLog persistentInstance) {
		log.debug("removing TblZtcGoldLog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblZtcGoldLog merge(TblZtcGoldLog detachedInstance) {
		log.debug("merging TblZtcGoldLog instance");
		try {
			TblZtcGoldLog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblZtcGoldLog findById(Long id) {
		log.debug("getting TblZtcGoldLog instance with id: " + id);
		try {
			TblZtcGoldLog instance = entityManager.find(TblZtcGoldLog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
