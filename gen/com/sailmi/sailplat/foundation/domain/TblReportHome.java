package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblReport.
 * @see com.sailmi.sailplat.foundation.domain.TblReport
 * @author Hibernate Tools
 */
@Stateless
public class TblReportHome {

	private static final Log log = LogFactory.getLog(TblReportHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblReport transientInstance) {
		log.debug("persisting TblReport instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblReport persistentInstance) {
		log.debug("removing TblReport instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblReport merge(TblReport detachedInstance) {
		log.debug("merging TblReport instance");
		try {
			TblReport result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblReport findById(Long id) {
		log.debug("getting TblReport instance with id: " + id);
		try {
			TblReport instance = entityManager.find(TblReport.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
