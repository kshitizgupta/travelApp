package org.kshitiz.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by kshitzgupta on 26/6/16.
 */

/**
 * This class serves as the Base class for all other DAOs - namely to hold
 * common CRUD methods that they might all use. You should only need to extend
 * this class when your require custom CRUD logic.
 * <p/>
 * <p>To register this class in your Spring context file, use the following XML.
 * <pre>
 *      &lt;bean id="fooDao" class="com.bankbazaar.dao.hibernate.GenericDaoHibernate"&gt;
 *          &lt;constructor-arg value="com.bankbazaar.model.Foo"/&gt;
 *      &lt;/bean&gt;
 * </pre>
 *
 * @param <T>  a type variable
 * @param <PK> the primary key for that type
 * @author <a href="mailto:bwnoll@gmail.com">Bryan Noll</a>
 */
public class GenericDaoHibernate<T, PK extends Serializable> implements GenericDao<T, PK > {
    /**
     * Log variable for all child classes. Uses LogFactory.getLog(getClass()) from Commons Logging
     */
    protected final Log log = LogFactory.getLog(getClass());
    protected Class<T> persistentClass;
//    private HibernateTemplate hibernateTemplate;
    private SessionFactory sessionFactory;


    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public List<T> getAllDistinct() {
        return null;
    }

    @Override
    public T get(PK id) {
        return null;
    }

    @Override
    public boolean exists(PK id) {
        return false;
    }

    @Override
    public T save(T object) {
        return null;
    }

    @Override
    public void remove(PK id) {

    }

    @Override
    public void remove(T object) {

    }

    @Override
    public List<T> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
        return null;
    }

    @Override
    public List<T> findByExample(T exampleInstance) {
        return null;
    }

    @Override
    public List<T> findByExample(T exampleInstance, String[] excludeProperty) {
        return null;
    }

    @Override
    public List<T> findByDetachedCriteria(DetachedCriteria detachedCriteria) {
        return null;
    }

    @Override
    public List<T> findByDetachedCriteria(DetachedCriteria detachedCriteria, int firstResult, int maxResults) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public List<T> findByExampleHT(T exampleInstance) {
        return null;
    }

    @Override
    public List<T> findByExampleHT(T exampleInstance, int firstResult, int maxResults) {
        return null;
    }
}
