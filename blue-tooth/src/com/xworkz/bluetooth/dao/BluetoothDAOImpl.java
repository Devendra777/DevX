package com.xworkz.bluetooth.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bluetooth.dto.BluetoothSpeakerDTO;

// DAO - write persistence logic - design pattern
public class BluetoothDAOImpl implements BluetoothDAO {

	@Override
	public void save(BluetoothSpeakerDTO bluetoothSpeakerDTO) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BluetoothSpeakerDTO.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(bluetoothSpeakerDTO);
		transaction.commit();
		session.close();
		factory.close();
	}

	@Override
	public BluetoothSpeakerDTO getBlueToothById(int id) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BluetoothSpeakerDTO.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		BluetoothSpeakerDTO bluetoothSpeakerDTO = session.get(BluetoothSpeakerDTO.class, id);
		session.close();
		factory.close();
		return bluetoothSpeakerDTO;

	}

	@Override
	public void updateCompanyByBluetoothName(String bluetoothName, String company ) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BluetoothSpeakerDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		BluetoothSpeakerDTO bluetoothSpeakerDTO = session.get(BluetoothSpeakerDTO.class, "");
		if (bluetoothSpeakerDTO != null) {
			if (bluetoothName.equalsIgnoreCase(bluetoothSpeakerDTO.getBluetoothName())) {
				bluetoothSpeakerDTO.setCompanyName(company);
				session.update(bluetoothSpeakerDTO);
			}

		}

		transaction.commit();
		session.close();
		factory.close();
	}

}