package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblRolegroup.
 * @see com.sailmi.sailplat.foundation.domain.TblRolegroup
 * @author Hibernate Tools
 */
@Stateless
public class TblRolegroupHome {

	private static final Log log = LogFactory.getLog(TblRolegroupHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblRolegroup transientInstance) {
		log.debug("persisting TblRolegroup instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblRolegroup persistentInstance) {
		log.debug("removing TblRolegroup instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblRolegroup merge(TblRolegroup detachedInstance) {
		log.debug("merging TblRolegroup instance");
		try {
			TblRolegroup result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblRolegroup findById(Long id) {
		log.debug("getting TblRolegroup instance with id: " + id);
		try {
			TblRolegroup instance = entityManager.find(TblRolegroup.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
