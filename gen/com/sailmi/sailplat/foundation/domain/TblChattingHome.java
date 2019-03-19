package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblChatting.
 * @see com.sailmi.sailplat.foundation.domain.TblChatting
 * @author Hibernate Tools
 */
@Stateless
public class TblChattingHome {

	private static final Log log = LogFactory.getLog(TblChattingHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblChatting transientInstance) {
		log.debug("persisting TblChatting instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblChatting persistentInstance) {
		log.debug("removing TblChatting instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblChatting merge(TblChatting detachedInstance) {
		log.debug("merging TblChatting instance");
		try {
			TblChatting result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblChatting findById(Long id) {
		log.debug("getting TblChatting instance with id: " + id);
		try {
			TblChatting instance = entityManager.find(TblChatting.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
