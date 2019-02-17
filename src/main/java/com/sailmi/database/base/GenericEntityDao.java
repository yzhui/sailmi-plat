package com.sailmi.database.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sailmi.exception.CanotRemoveObjectException;
import com.sailmi.tools.CommUtil;

@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
public class GenericEntityDao extends HibernateDaoSupport {

	public Object get(Class clazz, Serializable id) {
		if (id == null)
			return null;
		return getHibernateTemplate().getSessionFactory().getCurrentSession().get(clazz, id);
	}

	public List<Object> find(Class clazz, final String queryStr, final Map params, final int begin, final int max) {
		final Class claz = clazz;
		System.out.println(this.getClass().getName()+":find class "+clazz.getName()+" for list ......................");
		List ret = (List) getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				System.out.println(this.getClass().getName()+":find class call back"+clazz.getName()+" for list ......................");
				// TODO Auto-generated method stub
				String clazzName = claz.getName();
				StringBuffer sb = new StringBuffer("select obj from ");
				sb.append(clazzName).append(" obj").append(" where ").append(queryStr);
				Query query = session.createQuery(sb.toString());
				for (Iterator localIterator = params.keySet().iterator(); localIterator.hasNext();) {
					Object key = localIterator.next();
					query.setParameter(key.toString(), params.get(key));
				}
				if ((begin >= 0) && (max > 0)) {
					query.setFirstResult(begin);
					query.setMaxResults(max);
				}
				query.setCacheable(true);
				return query.list();
			}
		});
		if ((ret != null) && (ret.size() >= 0)) {
			return ret;
		}
		return new ArrayList();
	}

	public List query(final String queryStr, final Map params, final int begin, final int max) {
		System.out.println(this.getClass().getName()+":query str "+queryStr+" for list ......................");
		List list = (List) getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				System.out.println(this.getClass().getName()+":call back query str "+queryStr+" for list ......................");
				Query query = session.createQuery(queryStr);
				if ((params != null) && (params.size() > 0)) {
					for (Iterator localIterator = params.keySet().iterator(); localIterator.hasNext();) {
						Object key = localIterator.next();
						query.setParameter(key.toString(), params.get(key));
					}
				}
				if ((begin >= 0) && (max > 0)) {
					query.setFirstResult(begin);
					query.setMaxResults(max);
				}
				query.setCacheable(true);
				return query.list();
			}
		});
		if ((list != null) && (list.size() > 0)) {
			return list;
		}
		return new ArrayList();
	}

	public void remove(Class clazz, Serializable id) throws CanotRemoveObjectException {
		System.out.println(this.getClass().getName()+":remove class "+clazz.getName()+" for void ......................");
		Object object = get(clazz, id);
		if (object != null)
			try {
				getHibernateTemplate().delete(object);
			} catch (Exception e) {
				throw new CanotRemoveObjectException();
			}
	}

	public void save(Object instance) {
		System.out.println(this.getClass().getName()+":save class "+instance.getClass().getName()+" for void ......................");
		getHibernateTemplate().persist(instance);
	}

	public Object getBy(Class clazz, final String propertyName, final Object value) {
		System.out.println(this.getClass().getName()+":get by "+value.getClass().getName()+" for object ......................");
		final Class claz = clazz;
		List ret = (List) getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				System.out.println(this.getClass().getName()+":call back get by "+value.getClass().getName()+" for object ......................");
				String clazzName = claz.getName();
				StringBuffer sb = new StringBuffer("select obj from ");
				sb.append(clazzName).append(" obj");
				Query query = null;
				if ((propertyName != null) && (value != null)) {
					sb.append(" where obj.").append(propertyName).append(" = :value");
					query = session.createQuery(sb.toString()).setParameter("value", value);
				} else {
					query = session.createQuery(sb.toString());
				}
				query.setCacheable(true);
				return query.list();
			}
		});
		if ((ret != null) && (ret.size() == 1))
			return ret.get(0);
		if ((ret != null) && (ret.size() > 1)) {
			return ret.get(0);
		}
		return null;
	}

	public List executeNamedQuery(final String queryName, final Object[] params, final int begin, final int max) {
		System.out.println(this.getClass().getName()+":executeNamedQuery "+queryName+" for list ......................");
		List ret = (List) getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				System.out.println(this.getClass().getName()+":executeNamedQuery callback"+queryName+" for list ......................");
				Query query = session.getNamedQuery(queryName);
				int parameterIndex = 1;
				if ((params != null) && (params.length > 0)) {
					for (Object obj : params) {
						query.setParameter(parameterIndex++, obj);
					}
				}
				if ((begin >= 0) && (max > 0)) {
					query.setFirstResult(begin);
					query.setMaxResults(max);
				}
				query.setCacheable(true);
				return query.list();
			}
		});
		if ((ret != null) && (ret.size() >= 0)) {
			return ret;
		}
		return new ArrayList();
	}

	public void update(Object instance) {
		getHibernateTemplate().merge(instance);
	}

	public List executeNativeNamedQuery(final String nnq) {
		System.out.println(this.getClass().getName()+":executeNativeNamedQuery "+nnq+" for list ......................");
		Object ret = getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				System.out.println(this.getClass().getName()+":executeNativeNamedQuery callback"+nnq+" for list ......................");
				Query query = session.createNativeQuery(nnq);
				return query.list();
			}
		});
		return (List) ret;
	}

	public List executeNativeQuery(final String nnq, final Map params, final int begin, final int max) {
		System.out.println(this.getClass().getName()+":executeNativeQuery "+nnq+" for list ......................");
		List ret = (List) getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				System.out.println(this.getClass().getName()+":executeNativeQuery call back"+nnq+" for list ......................");
				Query query = session.createNativeQuery(nnq);
				int parameterIndex = 1;
				if (params != null) {
					Iterator its = params.keySet().iterator();
					while (its.hasNext()) {
						query.setParameter(CommUtil.null2String(its.next()), params.get(its.next()));
					}
				}
				if ((begin >= 0) && (max > 0)) {
					query.setFirstResult(begin);
					query.setMaxResults(max);
				}

				return query.list();
			}
		});
		if ((ret != null) && (ret.size() >= 0)) {
			return ret;
		}
		return new ArrayList();
	}

	public List executeNativeQuery(final String nnq, final Object[] params, final int begin, final int max) {
		System.out.println(this.getClass().getName()+":executeNativeQuery by min and max "+nnq+" for list ......................");
		List ret = (List) getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				System.out.println(this.getClass().getName()+":executeNativeQuery callback by min and max "+nnq+" for list ......................");
				Query query = session.createNativeQuery(nnq);
				int parameterIndex = 1;
				if ((params != null) && (params.length > 0)) {
					for (Object obj : params) {
						query.setParameter(parameterIndex++, obj);
					}
				}
				if ((begin >= 0) && (max > 0)) {
					query.setFirstResult(begin);
					query.setMaxResults(max);
				}

				return query.getResultList();
			}
		});
		if ((ret != null) && (ret.size() >= 0)) {
			return ret;
		}
		return new ArrayList();
	}

	public int executeNativeSQL(final String nnq) {
		System.out.println(this.getClass().getName()+":executeNativeSQL by min and max "+nnq+" for list ......................");
		Object ret = getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				System.out.println(this.getClass().getName()+":executeNativeSQL call back by min and max "+nnq+" for list ......................");
				Query query = session.createNativeQuery(nnq);
				query.setHint("org.hibernate.cacheable", Boolean.valueOf(true));
				return Integer.valueOf(query.executeUpdate());
			}
		});
		return ((Integer) ret).intValue();
	}

	public int batchUpdate(final String jpql, final Object[] params) {
		Object ret = getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException {
				Query query = session.createQuery(jpql);
				int parameterIndex = 1;
				if ((params != null) && (params.length > 0)) {
					for (Object obj : params) {
						query.setParameter(parameterIndex++, obj);
					}
				}
				query.setHint("org.hibernate.cacheable", Boolean.valueOf(true));
				return Integer.valueOf(query.executeUpdate());
			}
		});
		return ((Integer) ret).intValue();
	}
	public void flush() {
		System.out.println(this.getClass().getName()+":flush sessions  ......................");
		getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException {
				System.out.println(this.getClass().getName()+": flush session start!"+session);
				session.getTransaction().commit();
				System.out.println(this.getClass().getName()+": flush session end!"+session);
				return session;
			}
		});
	}
}