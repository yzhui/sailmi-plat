package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblHomepage.
 * @see com.sailmi.sailplat.foundation.domain.TblHomepage
 * @author Hibernate Tools
 */
@Stateless
public class TblHomepageHome {

	private static final Log log = LogFactory.getLog(TblHomepageHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblHomepage transientInstance) {
		log.debug("persisting TblHomepage instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblHomepage persistentInstance) {
		log.debug("removing TblHomepage instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblHomepage merge(TblHomepage detachedInstance) {
		log.debug("merging TblHomepage instance");
		try {
			TblHomepage result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblHomepage findById(Long id) {
		log.debug("getting TblHomepage instance with id: " + id);
		try {
			TblHomepage instance = entityManager.find(TblHomepage.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
