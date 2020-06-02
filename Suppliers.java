package com.cg.inventorymanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="suppliers")
public class Suppliers {
	
	@Id
	@GeneratedValue
	@Column(name="supplier_id")
	private Integer supplierId;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="phone_no")
	private Long phoneNo;
	
	public Suppliers() {
		
	}

	public Suppliers(Integer supplierId, String name, String address, Long phoneNo) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public Suppliers(String name, String address, Long phoneNo) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Suppliers [supplierId=" + supplierId + ", name=" + name + ", address=" + address + ", phoneNo="
				+ phoneNo + "]";
	}

}
