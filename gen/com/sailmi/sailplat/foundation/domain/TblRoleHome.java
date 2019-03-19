package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblRole.
 * @see com.sailmi.sailplat.foundation.domain.TblRole
 * @author Hibernate Tools
 */
@Stateless
public class TblRoleHome {

	private static final Log log = LogFactory.getLog(TblRoleHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblRole transientInstance) {
		log.debug("persisting TblRole instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblRole persistentInstance) {
		log.debug("removing TblRole instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblRole merge(TblRole detachedInstance) {
		log.debug("merging TblRole instance");
		try {
			TblRole result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblRole findById(Long id) {
		log.debug("getting TblRole instance with id: " + id);
		try {
			TblRole instance = entityManager.find(TblRole.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
