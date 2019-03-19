package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblPartner.
 * @see com.sailmi.sailplat.foundation.domain.TblPartner
 * @author Hibernate Tools
 */
@Stateless
public class TblPartnerHome {

	private static final Log log = LogFactory.getLog(TblPartnerHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblPartner transientInstance) {
		log.debug("persisting TblPartner instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblPartner persistentInstance) {
		log.debug("removing TblPartner instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblPartner merge(TblPartner detachedInstance) {
		log.debug("merging TblPartner instance");
		try {
			TblPartner result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblPartner findById(Long id) {
		log.debug("getting TblPartner instance with id: " + id);
		try {
			TblPartner instance = entityManager.find(TblPartner.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
