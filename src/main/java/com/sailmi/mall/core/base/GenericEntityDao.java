package com.sailmi.mall.core.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sailmi.mall.core.exception.CanotRemoveObjectException;
import com.sailmi.mall.core.tools.CommUtil;

@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
public class GenericEntityDao extends HibernateDaoSupport 
{
	  
  public Object get(Class clazz, Serializable id)
  {
    if (id == null)
      return null;
    return getHibernateTemplate().get(clazz, id);
  }

  public List<Object> find( Class clazz, final String queryStr, final Map params, final int begin, final int max)
  {
    final Class claz = clazz;
    List ret = (List) getHibernateTemplate().execute( new HibernateCallback()
    {
	@Override
	public Object doInHibernate(Session session) throws HibernateException {
		// TODO Auto-generated method stub

        String clazzName = claz.getName();
        StringBuffer sb = new StringBuffer("select obj from ");
        sb.append(clazzName).append(" obj").append(" where ")
          .append(queryStr);
        Query query = session.createQuery(sb.toString());
        for (Iterator localIterator = params.keySet().iterator(); localIterator.hasNext(); ) { Object key = localIterator.next();
          query.setParameter(key.toString(), params.get(key));
        }
        if ((begin >= 0) && (max > 0)) {
          query.setFirstResult(begin);
          query.setMaxResults(max);
        }
        query.setHint("org.hibernate.cacheable", Boolean.valueOf(true));
        return query.getResultList();
	}
    });
    if ((ret != null) && (ret.size() >= 0)) {
      return ret;
    }
    return new ArrayList();
  }

  public List query( final String queryStr, final Map params, final int begin, final int max)
  {
    List list = (List)getHibernateTemplate().execute(new HibernateCallback()
    {

	@Override
	public Object doInHibernate(Session session) throws HibernateException {
		// TODO Auto-generated method stub
		System.out.println("queryStr"+queryStr);
		Query query = session.createQuery(queryStr);
        if ((params != null) && (params.size() > 0)) {
          for (Iterator localIterator = params.keySet().iterator(); localIterator.hasNext(); ) { Object key = localIterator.next();
            query.setParameter(key.toString(), params.get(key));
          }
        }
        if ((begin >= 0) && (max > 0)) {
          query.setFirstResult(begin);
          query.setMaxResults(max);
        }
        query.setHint("org.hibernate.cacheable", Boolean.valueOf(true));
        return query.getResultList();
	}
    });
    if ((list != null) && (list.size() > 0)) {
      return list;
    }
    return new ArrayList();
  }

  public void remove(Class clazz, Serializable id)
    throws CanotRemoveObjectException
  {
    Object object = get(clazz, id);
    if (object != null)
      try {
        getHibernateTemplate().delete(object);
      } catch (Exception e) {
        throw new CanotRemoveObjectException();
      }
  }

  public void save(Object instance)
  {
	  getHibernateTemplate().persist(instance);
  }

  public Object getBy(Class clazz,final String propertyName,final Object value)
  {
    final Class claz = clazz;
    List ret = (List)getHibernateTemplate().execute(new HibernateCallback() {
      public Object doInHibernate(Session session) throws PersistenceException {
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
        query.setHint("org.hibernate.cacheable", Boolean.valueOf(true));
        return query.getResultList();
      }
    });
    if ((ret != null) && (ret.size() == 1))
      return ret.get(0);
    if ((ret != null) && (ret.size() > 1)) {
        return ret.get(0);
    }
    return null;
  }

  public List executeNamedQuery(final String queryName, final Object[] params, final int begin, final int max)
  {
    List ret = (List)getHibernateTemplate().execute(new HibernateCallback()
    {
      public Object doInHibernate(Session session) throws PersistenceException {
        Query query = session.createNamedQuery(queryName);
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
        query.setHint("org.hibernate.cacheable", Boolean.valueOf(true));
        return query.getResultList();
      }
    });
    if ((ret != null) && (ret.size() >= 0)) {
      return ret;
    }
    return new ArrayList();
  }

  public void update(Object instance)
  {
	  getHibernateTemplate().merge(instance);
  }

  public List executeNativeNamedQuery(final String nnq) {
    Object ret = getHibernateTemplate().execute(new HibernateCallback()
    {
      public Object doInHibernate(Session session) throws PersistenceException {
        Query query = session.createNativeQuery(nnq);
        return query.getResultList();
      }
    });
    return (List)ret;
  }

  public List executeNativeQuery(final String nnq, final Map params, final int begin, final int max)
  {
    List ret = (List)getHibernateTemplate().execute(new HibernateCallback()
    {
      public Object doInHibernate(Session session) throws PersistenceException {
        Query query = session.createNativeQuery(nnq);
        int parameterIndex = 1;
        if (params != null) {
          Iterator its = params.keySet().iterator();
          while (its.hasNext()) {
            query.setParameter(CommUtil.null2String(its.next()), 
              params.get(its.next()));
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

  public List executeNativeQuery(final String nnq, final Object[] params, final int begin, final int max)
  {
    List ret = (List)getHibernateTemplate().execute(new HibernateCallback()
    {
      public Object doInHibernate(Session session) throws PersistenceException {
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

  public int executeNativeSQL(final String nnq)
  {
    Object ret = getHibernateTemplate().execute(new HibernateCallback()
    {
      public Object doInHibernate(Session session) throws PersistenceException {
        Query query = session.createNativeQuery(nnq);
        query.setHint("org.hibernate.cacheable", Boolean.valueOf(true));
        return Integer.valueOf(query.executeUpdate());
      }
    });
    return ((Integer)ret).intValue();
  }

  public int batchUpdate(final String jpql, final Object[] params) {
    Object ret = getHibernateTemplate().execute(new HibernateCallback()
    {
      public Object doInHibernate(Session session) throws PersistenceException {
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
    return ((Integer)ret).intValue();
  }

  public void flush() {
    getHibernateTemplate().execute(new HibernateCallback()
    {
      public Object doInHibernate(Session session) throws PersistenceException {
    	  session.getTransaction().commit();
        return null;
      }
    });
  }
}