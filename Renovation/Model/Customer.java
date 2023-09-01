package com.ex.Renovation.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Customer_Table")
public class Customer {
	@Id
	@GeneratedValue
	private  int customerId;
	private String customerName;
	private String categoryType;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk")
	private List<Products> products;


	public Customer(int customerId, String customerName, String categoryType, List<Products> products) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.categoryType = categoryType;
		this.products = products;
	}


	public Customer() {
		super();
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCategoryType() {
		return categoryType;
	}


	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}


	public List<Products> getProducts() {
		return products;
	}


	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	
	
}