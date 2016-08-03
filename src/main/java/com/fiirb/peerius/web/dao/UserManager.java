package com.fiirb.peerius.web.dao;

import com.fiirb.peerius.web.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by brianlewis on 02/08/2016.
 */
public class UserManager {

    @Autowired
    private SessionFactory sessionFactory;

    public void persistUser(User user){
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        session.save(user);
        transaction.commit();
    }
}
