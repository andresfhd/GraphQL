package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class Client {
	
	@Id
	private String idClient;
	private String fullName;

	@OneToMany(mappedBy = "client")
	List<Sale> sales;	
	
	
	public Client() {}
	public Client(String idClient, String fullName) {
		this.idClient = idClient;
		this.fullName = fullName;
	}
	
	public String getIdClient() {
		return idClient;
	}
	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
