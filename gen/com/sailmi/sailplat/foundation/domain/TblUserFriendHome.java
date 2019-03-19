package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:20 by Hibernate Tools 5.2.11.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblUserFriend.
 * @see com.sailmi.sailplat.foundation.domain.TblUserFriend
 * @author Hibernate Tools
 */
@Stateless
public class TblUserFriendHome {

	private static final Log log = LogFactory.getLog(TblUserFriendHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblUserFriend transientInstance) {
		log.debug("persisting TblUserFriend instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblUserFriend persistentInstance) {
		log.debug("removing TblUserFriend instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblUserFriend merge(TblUserFriend detachedInstance) {
		log.debug("merging TblUserFriend instance");
		try {
			TblUserFriend result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblUserFriend findById(Long id) {
		log.debug("getting TblUserFriend instance with id: " + id);
		try {
			TblUserFriend instance = entityManager.find(TblUserFriend.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
