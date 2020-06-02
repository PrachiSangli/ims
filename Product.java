package com.cg.inventorymanagementsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private Integer productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_cost")
	private Double productCost;
	@Column(name="manufacture_date")
	@Temporal(TemporalType.DATE)
	private Date manufactureDate;
	@Column(name="expiry_date")
	@Temporal(TemporalType.DATE)
	private Date expiryDate;
	@Column(name="units")
	private Integer units;
	@Column(name="status")
	private String status;

	public Product() {
		
	}

	public Product(Integer productId, String productName, Double productCost, Date manufactureDate, Date expiryDate,
			Integer units, String status) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.units = units;
		this.status = status;
	}

	public Product(String productName, Double productCost, Date manufactureDate, Date expiryDate, Integer units,
			String status) {
		super();
		this.productName = productName;
		this.productCost = productCost;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.units = units;
		this.status = status;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductCost() {
		return productCost;
	}

	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", manufactureDate=" + manufactureDate + ", expiryDate=" + expiryDate + ", units=" + units
				+ ", status=" + status + "]";
	}
	
}
