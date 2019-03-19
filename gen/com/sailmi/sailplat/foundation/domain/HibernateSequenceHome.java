package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class HibernateSequence.
 * @see com.sailmi.sailplat.foundation.domain.HibernateSequence
 * @author Hibernate Tools
 */
@Stateless
public class HibernateSequenceHome {

	private static final Log log = LogFactory.getLog(HibernateSequenceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(HibernateSequence transientInstance) {
		log.debug("persisting HibernateSequence instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(HibernateSequence persistentInstance) {
		log.debug("removing HibernateSequence instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public HibernateSequence merge(HibernateSequence detachedInstance) {
		log.debug("merging HibernateSequence instance");
		try {
			HibernateSequence result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public HibernateSequence findById(Long id) {
		log.debug("getting HibernateSequence instance with id: " + id);
		try {
			HibernateSequence instance = entityManager.find(HibernateSequence.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
