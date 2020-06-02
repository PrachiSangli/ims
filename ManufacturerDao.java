package com.cg.inventorymanagementsystem.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.cg.inventorymanagementsystem.exceptions.IMSException;
import com.cg.inventorymanagementsystem.model.Manufacturer;
import com.cg.inventorymanagementsystem.model.Suppliers;
import com.cg.inventorymanagementsystem.utility.JPAUtility;

public class ManufacturerDao implements IManufacturerDao {

	private Logger logger = Logger.getLogger(ManufacturerDao.class);
	Scanner sc = new Scanner(System.in);
	EntityManagerFactory factory = null;
	EntityManager manager = null;
	EntityTransaction transaction = null;

	@Override
	public int addOrders(Manufacturer order) throws IMSException {
		logger.info("in add order method");
		factory = JPAUtility.getEntityManagerFactory();
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		int orderId = 0;

		transaction.begin();

		try {
			manager.persist(order);
			transaction.commit();

			orderId = order.getOrderId();
			logger.info("id generated " + orderId);

		} catch (PersistenceException e) {
			logger.error(e.getMessage());
			transaction.rollback();
		} finally {
			manager.close();
			factory.close();
		}

		return orderId;
	}

	@Override
	public List<Manufacturer> getAllOrders() throws IMSException {
		logger.info("in get all products method");
		factory = JPAUtility.getEntityManagerFactory();
		logger.info("factory created");
		manager = factory.createEntityManager();
		logger.info("manager created");
		Query query = manager.createQuery(QueryConstants.GET_ORDERS);
		return query.getResultList();
	}

	/*
	 * @Override public boolean updateOrders(int orderId) throws IMSException { try
	 * { factory = Persistence.createEntityManagerFactory("Test"); manager =
	 * factory.createEntityManager(); transaction = manager.getTransaction();
	 * transaction.begin();
	 * 
	 * try { Manufacturer record = manager.find(Manufacturer.class, orderId);
	 * 
	 * transaction.commit();
	 * System.out.println("order Details updated Successfully........"); } catch
	 * (Exception e) { System.out.println("order id is not present in the list"); }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); transaction.rollback(); } return
	 * true; }
	 */

	@Override
	public List<Suppliers> showSupplierDetails() throws IMSException {
		factory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = factory.createEntityManager();
		String jpql = "from ManufacturerBean";
		Query query = entityManager.createQuery(QueryConstants.GET_SUPPLIERS);

		List<Suppliers> record = query.getResultList();
		System.out.println(record);
		entityManager.close();

		return null;
	}

}
