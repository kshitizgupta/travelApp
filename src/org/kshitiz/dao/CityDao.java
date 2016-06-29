/**
 * Created by kshitzgupta on 5/6/16.
 */
package org.kshitiz.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.kshitiz.models.City;
import org.kshitiz.models.Weather;


public class CityDao {
    public CityDao() {
        System.out.println("CityDao called");
    }

    public void addCity(City city) {
        try {
            save(city);

            System.out.println("\n\n Details Added \n");

        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
    }

    private void save(City city) {
        // 1. configuring hibernate
        Configuration configuration = new Configuration().configure();

        // 2. create sessionfactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // 3. Get Session object
        Session session = sessionFactory.openSession();

        // 4. Starting Transaction
        Transaction transaction = session.beginTransaction();
        City City = city;
        session.save(city);
        transaction.commit();
    }
}