package com.cg.inventorymanagementsystem.dao;

import java.util.List;

import com.cg.inventorymanagementsystem.exceptions.IMSException;
import com.cg.inventorymanagementsystem.model.Manufacturer;
import com.cg.inventorymanagementsystem.model.Suppliers;

public interface IManufacturerDao {
	
	public int addOrders(Manufacturer order) throws IMSException;

	public List<Manufacturer> getAllOrders() throws IMSException;

	//public Manufacturer updateOrders(int orderId) throws IMSException;
	
	public List<Suppliers> showSupplierDetails()throws IMSException;

}
