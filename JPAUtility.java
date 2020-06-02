package com.cg.inventorymanagementsystem.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	
	private static EntityManagerFactory factory = null;

	static {

		factory = Persistence.createEntityManagerFactory("Test");
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return factory;
	}

}
