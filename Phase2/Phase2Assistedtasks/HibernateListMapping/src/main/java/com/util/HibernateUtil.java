package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Color;
import com.entity.EProduct;
import com.entity.Finance;
import com.entity.OS;
import com.entity.ScreenSize;

public class HibernateUtil {

	public static SessionFactory buildSessionFactory() {
		
		// Step 1
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EProduct.class);
		cfg.addAnnotatedClass(Color.class);
		cfg.addAnnotatedClass(ScreenSize.class);
		cfg.addAnnotatedClass(OS.class);
		cfg.addAnnotatedClass(Finance.class);
		
		//Step 2
		SessionFactory sf = cfg.buildSessionFactory();

		return sf;
	}

}
