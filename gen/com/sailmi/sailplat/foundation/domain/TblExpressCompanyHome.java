package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblExpressCompany.
 * @see com.sailmi.sailplat.foundation.domain.TblExpressCompany
 * @author Hibernate Tools
 */
@Stateless
public class TblExpressCompanyHome {

	private static final Log log = LogFactory.getLog(TblExpressCompanyHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblExpressCompany transientInstance) {
		log.debug("persisting TblExpressCompany instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblExpressCompany persistentInstance) {
		log.debug("removing TblExpressCompany instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblExpressCompany merge(TblExpressCompany detachedInstance) {
		log.debug("merging TblExpressCompany instance");
		try {
			TblExpressCompany result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblExpressCompany findById(Long id) {
		log.debug("getting TblExpressCompany instance with id: " + id);
		try {
			TblExpressCompany instance = entityManager.find(TblExpressCompany.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
