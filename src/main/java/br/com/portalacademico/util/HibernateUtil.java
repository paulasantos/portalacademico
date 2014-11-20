package br.com.portalacademico.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			
			Configuration cfg =  new Configuration();
			SessionFactory sf = cfg.configure().buildSessionFactory(new StandardServiceRegistryBuilder().build());
			return sf;
		} catch (Throwable ex) {
			System.out.println("test");
			System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	} 

}
