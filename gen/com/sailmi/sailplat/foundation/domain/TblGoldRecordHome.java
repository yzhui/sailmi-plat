package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoldRecord.
 * @see com.sailmi.sailplat.foundation.domain.TblGoldRecord
 * @author Hibernate Tools
 */
@Stateless
public class TblGoldRecordHome {

	private static final Log log = LogFactory.getLog(TblGoldRecordHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoldRecord transientInstance) {
		log.debug("persisting TblGoldRecord instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoldRecord persistentInstance) {
		log.debug("removing TblGoldRecord instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoldRecord merge(TblGoldRecord detachedInstance) {
		log.debug("merging TblGoldRecord instance");
		try {
			TblGoldRecord result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoldRecord findById(Long id) {
		log.debug("getting TblGoldRecord instance with id: " + id);
		try {
			TblGoldRecord instance = entityManager.find(TblGoldRecord.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
