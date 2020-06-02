package com.cg.inventorymanagementsystem.dao;

import java.util.List;

import com.cg.inventorymanagementsystem.exceptions.IMSException;
import com.cg.inventorymanagementsystem.model.Manufacturer;
import com.cg.inventorymanagementsystem.model.Product;

public interface ISupplierDao {
	
	public List<Product> getAllProducts() throws IMSException;
	
	public List<Manufacturer> viewMyOrders(int supplierId) throws IMSException;
	
}
