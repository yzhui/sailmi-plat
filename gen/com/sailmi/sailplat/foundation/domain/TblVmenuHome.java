package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblVmenu.
 * @see com.sailmi.sailplat.foundation.domain.TblVmenu
 * @author Hibernate Tools
 */
@Stateless
public class TblVmenuHome {

	private static final Log log = LogFactory.getLog(TblVmenuHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblVmenu transientInstance) {
		log.debug("persisting TblVmenu instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblVmenu persistentInstance) {
		log.debug("removing TblVmenu instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblVmenu merge(TblVmenu detachedInstance) {
		log.debug("merging TblVmenu instance");
		try {
			TblVmenu result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblVmenu findById(Long id) {
		log.debug("getting TblVmenu instance with id: " + id);
		try {
			TblVmenu instance = entityManager.find(TblVmenu.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
