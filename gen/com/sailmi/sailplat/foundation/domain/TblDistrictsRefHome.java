package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblDistrictsRef.
 * @see com.sailmi.sailplat.foundation.domain.TblDistrictsRef
 * @author Hibernate Tools
 */
@Stateless
public class TblDistrictsRefHome {

	private static final Log log = LogFactory.getLog(TblDistrictsRefHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblDistrictsRef transientInstance) {
		log.debug("persisting TblDistrictsRef instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblDistrictsRef persistentInstance) {
		log.debug("removing TblDistrictsRef instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblDistrictsRef merge(TblDistrictsRef detachedInstance) {
		log.debug("merging TblDistrictsRef instance");
		try {
			TblDistrictsRef result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblDistrictsRef findById(Long id) {
		log.debug("getting TblDistrictsRef instance with id: " + id);
		try {
			TblDistrictsRef instance = entityManager.find(TblDistrictsRef.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
