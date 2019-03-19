package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblAddress.
 * @see com.sailmi.sailplat.foundation.domain.TblAddress
 * @author Hibernate Tools
 */
@Stateless
public class TblAddressHome {

	private static final Log log = LogFactory.getLog(TblAddressHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblAddress transientInstance) {
		log.debug("persisting TblAddress instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblAddress persistentInstance) {
		log.debug("removing TblAddress instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblAddress merge(TblAddress detachedInstance) {
		log.debug("merging TblAddress instance");
		try {
			TblAddress result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblAddress findById(Long id) {
		log.debug("getting TblAddress instance with id: " + id);
		try {
			TblAddress instance = entityManager.find(TblAddress.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
