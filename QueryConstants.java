package com.cg.inventorymanagementsystem.dao;

public interface QueryConstants {
	
	public String GET_PRODUCTS = "SELECT p FROM Product p";
	
	public String GET_SUPPLIERS = "SELECT s FROM Suppliers s";
	
	public String GET_ORDERS = "SELECT o FROM Manufacturer o";
	
	public String GET_ORDER = "SELECT o FROM Manufacturer o where supplierId :sid";
}
