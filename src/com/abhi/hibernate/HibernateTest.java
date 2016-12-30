package com.abhi.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abhi.hibernate.dto.Address;
import com.abhi.hibernate.dto.FourWheeler;
import com.abhi.hibernate.dto.TwoWheeler;
import com.abhi.hibernate.dto.UserDetails;
import com.abhi.hibernate.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
//		UserDetails user = new UserDetails();
//		user.setUserName("Abhishek");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Maruti");
		
		TwoWheeler twoWheeler =  new TwoWheeler();
		twoWheeler.setVehicleName("Bike");
		twoWheeler.setSteeringHandle("Bike Handle");
		
		FourWheeler fourWheeler =  new FourWheeler();
		fourWheeler.setVehicleName("Car");
		fourWheeler.setStreeingWheel("Car Steering");
		
//		Vehicle vehicle2 = new Vehicle();
//		vehicle2.setVehicleName("Jeep");
//		
//		user.getVehicle().add(vehicle);
//		user.getVehicle().add(vehicle2);
		
//		vehicle.getUserList().add(user);
//		vehicle2.getUserList().add(user);
		
//		user.setPhoneNumber("7509272244");
//		user.setDateOfBirth(new Date());
		
//		Address homeAdd = new Address();
//		homeAdd.setStreet("STR");
//		homeAdd.setCity("BPL");
//		homeAdd.setState("MP");
//		homeAdd.setPincode(462023);
//		
//		Address officeAdd = new Address();
//		officeAdd.setStreet("OFSTR");
//		officeAdd.setCity("OFBPL");
//		officeAdd.setState("OFMP");
//		officeAdd.setPincode(462020);
//		
//		user.getListOfAddresses().add(homeAdd);
//		user.getListOfAddresses().add(officeAdd);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
//			session.persist(user);
			session.save(vehicle);
			session.save(twoWheeler);
			session.save(fourWheeler);
//			session.save(vehicle2);
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace(); 
		}finally {
			session.close();
		}
		
//		user = null;
//		
//		session = sessionFactory.openSession();
//		try {
//			transaction = session.beginTransaction();
//			user = (UserDetails) session.get(UserDetails.class, 1);
//			System.out.println("User Name is -> "+user.getUserName());
//			transaction.commit();
//		}catch (Exception e) {
//			if (transaction != null)
//				transaction.rollback();
//			e.printStackTrace(); 
//		}finally {
//			session.close();
//		}
	}

}
