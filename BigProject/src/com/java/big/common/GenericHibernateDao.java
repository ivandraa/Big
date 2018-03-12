package com.java.big.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GenericHibernateDao {
	
	@Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
	
	protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
