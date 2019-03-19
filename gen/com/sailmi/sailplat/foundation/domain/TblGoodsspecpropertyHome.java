package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblGoodsspecproperty.
 * @see com.sailmi.sailplat.foundation.domain.TblGoodsspecproperty
 * @author Hibernate Tools
 */
@Stateless
public class TblGoodsspecpropertyHome {

	private static final Log log = LogFactory.getLog(TblGoodsspecpropertyHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblGoodsspecproperty transientInstance) {
		log.debug("persisting TblGoodsspecproperty instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblGoodsspecproperty persistentInstance) {
		log.debug("removing TblGoodsspecproperty instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblGoodsspecproperty merge(TblGoodsspecproperty detachedInstance) {
		log.debug("merging TblGoodsspecproperty instance");
		try {
			TblGoodsspecproperty result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblGoodsspecproperty findById(Long id) {
		log.debug("getting TblGoodsspecproperty instance with id: " + id);
		try {
			TblGoodsspecproperty instance = entityManager.find(TblGoodsspecproperty.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
