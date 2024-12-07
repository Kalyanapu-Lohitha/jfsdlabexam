package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        // Load Hibernate Configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        // Start a transaction
        Transaction tx = session.beginTransaction();

        // Insert Device record
        Device device = new Device();
        device.setBrand("Generic");
        device.setModel("G1");
        device.setPrice(500.0);
        session.save(device);

        // Insert Smartphone record
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 14");
        smartphone.setPrice(1200.0);
        smartphone.setOperatingSystem("iOS");
        smartphone.setCameraResolution("48MP");
        session.save(smartphone);

        // Insert Tablet record
        Tablet tablet = new Tablet();
        tablet.setBrand("Samsung");
        tablet.setModel("Galaxy Tab S8");
        tablet.setPrice(700.0);
        tablet.setScreenSize("12.4 inches");
        tablet.setBatteryLife(12);
        session.save(tablet);

        // Commit the transaction
        tx.commit();
        session.close();
        factory.close();

        System.out.println("Records inserted successfully.");
    }
}
