package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblReportSubject.
 * @see com.sailmi.sailplat.foundation.domain.TblReportSubject
 * @author Hibernate Tools
 */
@Stateless
public class TblReportSubjectHome {

	private static final Log log = LogFactory.getLog(TblReportSubjectHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblReportSubject transientInstance) {
		log.debug("persisting TblReportSubject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblReportSubject persistentInstance) {
		log.debug("removing TblReportSubject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblReportSubject merge(TblReportSubject detachedInstance) {
		log.debug("merging TblReportSubject instance");
		try {
			TblReportSubject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblReportSubject findById(Long id) {
		log.debug("getting TblReportSubject instance with id: " + id);
		try {
			TblReportSubject instance = entityManager.find(TblReportSubject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
