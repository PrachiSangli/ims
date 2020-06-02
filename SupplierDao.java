package com.cg.inventorymanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.cg.inventorymanagementsystem.exceptions.IMSException;
import com.cg.inventorymanagementsystem.model.Manufacturer;
import com.cg.inventorymanagementsystem.model.Product;
import com.cg.inventorymanagementsystem.utility.JPAUtility;

public class SupplierDao implements ISupplierDao {
	
	EntityManagerFactory factory = null;
	EntityManager manager = null;
	EntityTransaction transaction = null;

	private Logger logger = Logger.getLogger(SupplierDao.class);

	@Override
	public List<Product> getAllProducts() throws IMSException {
		logger.info("in get all products method");
		factory = JPAUtility.getEntityManagerFactory();
		logger.info("factory created");
		manager = factory.createEntityManager();
		logger.info("manager created");
		Query query = manager.createQuery(QueryConstants.GET_PRODUCTS);
		return query.getResultList();
	}

	@Override
	public List<Manufacturer> viewMyOrders(int supplierId) throws IMSException {
		
		logger.info("supplier id is: " + supplierId);
		factory = JPAUtility.getEntityManagerFactory();
		manager = factory.createEntityManager();
		
		Query query = manager.createQuery(QueryConstants.GET_ORDER);
		return query.getResultList();
	
	}

}
