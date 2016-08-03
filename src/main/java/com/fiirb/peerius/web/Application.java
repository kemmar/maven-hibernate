package com.fiirb.peerius.web;

import com.fiirb.peerius.web.dao.UserManager;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {


    @Bean
    private static SessionFactory getSessionFactory() {
        try {
            return new org
                    .hibernate.cfg
                    .Configuration()
                    .configure()
                    .buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    @Bean
    public UserManager getUserManager(){
        return new UserManager();
    }

}
