package com.cg.inventorymanagementsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {

	@Id
	@GeneratedValue
	@Column(name = "order_id")
	private Integer orderId;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "order_date")
	private Date orderDate;
	@Column(name = "units")
	private Integer units;
	@Column(name = "price_per_unit")
	private Double pricePerUnit;
	@Column(name = "expected_date_delivery")
	private Date expectedDateOfDelivery;
	@Column(name = "supplier_id")
	private Integer supplierId;

	public Manufacturer() {

	}

	public Manufacturer(Integer orderId, String productName, Date orderDate, Integer units, Double pricePerUnit,
			Date expectedDateOfDelivery, Integer supplierId) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.orderDate = orderDate;
		this.units = units;
		this.pricePerUnit = pricePerUnit;
		this.expectedDateOfDelivery = expectedDateOfDelivery;
		this.supplierId = supplierId;
	}

	public Manufacturer(String productName, Date orderDate, Integer units, Double pricePerUnit,
			Date expectedDateOfDelivery, Integer supplierId) {
		super();
		this.productName = productName;
		this.orderDate = orderDate;
		this.units = units;
		this.pricePerUnit = pricePerUnit;
		this.expectedDateOfDelivery = expectedDateOfDelivery;
		this.supplierId = supplierId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

	public Double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public Date getExpectedDateOfDelivery() {
		return expectedDateOfDelivery;
	}

	public void setExpectedDateOfDelivery(Date expectedDateOfDelivery) {
		this.expectedDateOfDelivery = expectedDateOfDelivery;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	@Override
	public String toString() {
		return "Manufacturer [orderId=" + orderId + ", productName=" + productName + ", orderDate=" + orderDate
				+ ", units=" + units + ", pricePerUnit=" + pricePerUnit + ", expectedDateOfDelivery="
				+ expectedDateOfDelivery + ", supplierId=" + supplierId + "]";
	}

}
