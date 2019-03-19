package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblComplaintSubject.
 * @see com.sailmi.sailplat.foundation.domain.TblComplaintSubject
 * @author Hibernate Tools
 */
@Stateless
public class TblComplaintSubjectHome {

	private static final Log log = LogFactory.getLog(TblComplaintSubjectHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblComplaintSubject transientInstance) {
		log.debug("persisting TblComplaintSubject instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblComplaintSubject persistentInstance) {
		log.debug("removing TblComplaintSubject instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblComplaintSubject merge(TblComplaintSubject detachedInstance) {
		log.debug("merging TblComplaintSubject instance");
		try {
			TblComplaintSubject result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblComplaintSubject findById(Long id) {
		log.debug("getting TblComplaintSubject instance with id: " + id);
		try {
			TblComplaintSubject instance = entityManager.find(TblComplaintSubject.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
