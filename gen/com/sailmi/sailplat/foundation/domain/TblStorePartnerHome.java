package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblStorePartner.
 * @see com.sailmi.sailplat.foundation.domain.TblStorePartner
 * @author Hibernate Tools
 */
@Stateless
public class TblStorePartnerHome {

	private static final Log log = LogFactory.getLog(TblStorePartnerHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblStorePartner transientInstance) {
		log.debug("persisting TblStorePartner instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblStorePartner persistentInstance) {
		log.debug("removing TblStorePartner instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblStorePartner merge(TblStorePartner detachedInstance) {
		log.debug("merging TblStorePartner instance");
		try {
			TblStorePartner result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblStorePartner findById(Long id) {
		log.debug("getting TblStorePartner instance with id: " + id);
		try {
			TblStorePartner instance = entityManager.find(TblStorePartner.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
