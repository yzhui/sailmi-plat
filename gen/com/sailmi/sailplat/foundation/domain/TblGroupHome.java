package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGroup.
 * @see com.sailmi.sailplat.foundation.domain.TblGroup
 * @author Hibernate Tools
 */
@Stateless
public class TblGroupHome {

	private static final Log log = LogFactory.getLog(TblGroupHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGroup transientInstance) {
		log.debug("persisting TblGroup instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGroup persistentInstance) {
		log.debug("removing TblGroup instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGroup merge(TblGroup detachedInstance) {
		log.debug("merging TblGroup instance");
		try {
			TblGroup result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGroup findById(Long id) {
		log.debug("getting TblGroup instance with id: " + id);
		try {
			TblGroup instance = entityManager.find(TblGroup.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
