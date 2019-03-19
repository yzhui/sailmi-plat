package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblBrandcategory.
 * @see com.sailmi.sailplat.foundation.domain.TblBrandcategory
 * @author Hibernate Tools
 */
@Stateless
public class TblBrandcategoryHome {

	private static final Log log = LogFactory.getLog(TblBrandcategoryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblBrandcategory transientInstance) {
		log.debug("persisting TblBrandcategory instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblBrandcategory persistentInstance) {
		log.debug("removing TblBrandcategory instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblBrandcategory merge(TblBrandcategory detachedInstance) {
		log.debug("merging TblBrandcategory instance");
		try {
			TblBrandcategory result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblBrandcategory findById(Long id) {
		log.debug("getting TblBrandcategory instance with id: " + id);
		try {
			TblBrandcategory instance = entityManager.find(TblBrandcategory.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
