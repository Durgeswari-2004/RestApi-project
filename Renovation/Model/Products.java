package com.ex.Renovation.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Products_Table")
public class Products {
	@Id
	@GeneratedValue
	private int categoryId;
	private String productName;
	private String specification;
	
	
	public Products(int categoryId, String productName, String specification) {
		super();
		this.categoryId = categoryId;
		this.productName = productName;
		this.specification = specification;
	}
	public Products() {
		super();
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	
	

}