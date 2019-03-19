package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblUserAttention.
 * @see com.sailmi.sailplat.foundation.domain.TblUserAttention
 * @author Hibernate Tools
 */
@Stateless
public class TblUserAttentionHome {

	private static final Log log = LogFactory.getLog(TblUserAttentionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblUserAttention transientInstance) {
		log.debug("persisting TblUserAttention instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblUserAttention persistentInstance) {
		log.debug("removing TblUserAttention instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblUserAttention merge(TblUserAttention detachedInstance) {
		log.debug("merging TblUserAttention instance");
		try {
			TblUserAttention result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblUserAttention findById(Long id) {
		log.debug("getting TblUserAttention instance with id: " + id);
		try {
			TblUserAttention instance = entityManager.find(TblUserAttention.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
