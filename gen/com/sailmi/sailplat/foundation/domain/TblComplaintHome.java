package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblComplaint.
 * @see com.sailmi.sailplat.foundation.domain.TblComplaint
 * @author Hibernate Tools
 */
@Stateless
public class TblComplaintHome {

	private static final Log log = LogFactory.getLog(TblComplaintHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblComplaint transientInstance) {
		log.debug("persisting TblComplaint instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblComplaint persistentInstance) {
		log.debug("removing TblComplaint instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblComplaint merge(TblComplaint detachedInstance) {
		log.debug("merging TblComplaint instance");
		try {
			TblComplaint result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblComplaint findById(Long id) {
		log.debug("getting TblComplaint instance with id: " + id);
		try {
			TblComplaint instance = entityManager.find(TblComplaint.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
