package com.xworkz.whatsapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.whatsapp.dto.WhatsAppDTO;

public class WhatsAppDAOImpl implements WhatsAppDAO {

	@Override
	public void saveWhatsApp(WhatsAppDTO appDTO) {
		// Hibernate Logic
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(WhatsAppDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(appDTO);
		transaction.commit();
		session.close();
		factory.close();
	}

}
