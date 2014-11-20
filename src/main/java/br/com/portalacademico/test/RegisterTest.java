package br.com.portalacademico.test;

import org.hibernate.Session;

import br.com.portalacademico.bean.Advisor;
import br.com.portalacademico.util.HibernateUtil;

public class RegisterTest {
	public static void main(String[] args) {
		RegisterTest register = new RegisterTest();
		
		register.registerUser("Wellyngton", "Amaral");
		
		HibernateUtil.getSessionfactory().close();
	}
	
	private void registerUser(String name, String second_name){
		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		session.beginTransaction();
		
		Advisor advisor = new Advisor();
		advisor.setName(name);
		advisor.setSecond_name(second_name);
		session.save(advisor);
		
		session.getTransaction().commit();
	}

}
