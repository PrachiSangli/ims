package com.cg.inventorymanagementsystem.service;

import java.util.List;

import com.cg.inventorymanagementsystem.exceptions.IMSException;
import com.cg.inventorymanagementsystem.model.Manufacturer;
import com.cg.inventorymanagementsystem.model.Product;

public interface ISupplierService {
	
	public boolean validateName(String name) throws IMSException;
	
	public boolean validateCost(double salary)throws IMSException;
	
	public boolean validateUnits(int units) throws IMSException;
	
	public List<Product> getAllProducts()throws IMSException;
	
	public List<Manufacturer> getMyOrders(int supplierId) throws IMSException;

}
