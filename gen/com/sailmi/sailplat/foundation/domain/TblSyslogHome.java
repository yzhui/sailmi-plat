package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblSyslog.
 * @see com.sailmi.sailplat.foundation.domain.TblSyslog
 * @author Hibernate Tools
 */
@Stateless
public class TblSyslogHome {

	private static final Log log = LogFactory.getLog(TblSyslogHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblSyslog transientInstance) {
		log.debug("persisting TblSyslog instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblSyslog persistentInstance) {
		log.debug("removing TblSyslog instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblSyslog merge(TblSyslog detachedInstance) {
		log.debug("merging TblSyslog instance");
		try {
			TblSyslog result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblSyslog findById(Long id) {
		log.debug("getting TblSyslog instance with id: " + id);
		try {
			TblSyslog instance = entityManager.find(TblSyslog.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
