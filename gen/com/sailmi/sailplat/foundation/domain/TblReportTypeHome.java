package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblReportType.
 * @see com.sailmi.sailplat.foundation.domain.TblReportType
 * @author Hibernate Tools
 */
@Stateless
public class TblReportTypeHome {

	private static final Log log = LogFactory.getLog(TblReportTypeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblReportType transientInstance) {
		log.debug("persisting TblReportType instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblReportType persistentInstance) {
		log.debug("removing TblReportType instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblReportType merge(TblReportType detachedInstance) {
		log.debug("merging TblReportType instance");
		try {
			TblReportType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblReportType findById(Long id) {
		log.debug("getting TblReportType instance with id: " + id);
		try {
			TblReportType instance = entityManager.find(TblReportType.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
