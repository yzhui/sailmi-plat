package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblRoleRes.
 * @see com.sailmi.sailplat.foundation.domain.TblRoleRes
 * @author Hibernate Tools
 */
@Stateless
public class TblRoleResHome {

	private static final Log log = LogFactory.getLog(TblRoleResHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblRoleRes transientInstance) {
		log.debug("persisting TblRoleRes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblRoleRes persistentInstance) {
		log.debug("removing TblRoleRes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblRoleRes merge(TblRoleRes detachedInstance) {
		log.debug("merging TblRoleRes instance");
		try {
			TblRoleRes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblRoleRes findById(TblRoleResId id) {
		log.debug("getting TblRoleRes instance with id: " + id);
		try {
			TblRoleRes instance = entityManager.find(TblRoleRes.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
