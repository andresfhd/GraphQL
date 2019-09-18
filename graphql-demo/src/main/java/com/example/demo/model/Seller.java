package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class Seller {
	
	@Id
	private String idSeller;
	private String firstName;
	private String lastName;
	
	@OneToMany(mappedBy = "seller")
	List<Sale> sales;
	
	
	public String getIdSeller() {
		return idSeller;
	}
	public void setIdSeller(String idSeller) {
		this.idSeller = idSeller;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Sale> getSales() {
		return sales;
	}
	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}
}
