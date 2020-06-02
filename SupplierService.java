package com.cg.inventorymanagementsystem.service;

import java.util.List;
import java.util.regex.Pattern;

import com.cg.inventorymanagementsystem.dao.ISupplierDao;
import com.cg.inventorymanagementsystem.dao.SupplierDao;
import com.cg.inventorymanagementsystem.exceptions.IMSException;
import com.cg.inventorymanagementsystem.model.Manufacturer;
import com.cg.inventorymanagementsystem.model.Product;

public class SupplierService implements ISupplierService {

	ISupplierDao supplierDao = new SupplierDao();

	@Override
	public boolean validateName(String name) throws IMSException {
		boolean nameFlag = false;
		String nameRegEx = "[A-Z]{1}[A-Za-z\\s]{4,19}";

		if (Pattern.matches(nameRegEx, name)) {
			nameFlag = true;
		} else {
			throw new IMSException("First letter should be capital and length must be in the range of 5 to 20");
		}
		return nameFlag;
	}

	@Override
	public boolean validateCost(double salary) throws IMSException {

		boolean costFlag = false;

		if (salary > 5000) {
			costFlag = true;
		} else {
			throw new IMSException("cost should be greater than 5000");
		}

		return costFlag;
	}

	@Override
	public boolean validateUnits(int units) throws IMSException {

		boolean unitsFlag = false;

		if (units > 2) {
			unitsFlag = true;
		} else {
			throw new IMSException("units should be greater than 2");
		}

		return unitsFlag;
	}

	@Override
	public List<Product> getAllProducts() throws IMSException {

		return supplierDao.getAllProducts();
	}

	@Override
	public List<Manufacturer> getMyOrders(int supplierId) throws IMSException {

		return supplierDao.viewMyOrders(supplierId);

	}

}
