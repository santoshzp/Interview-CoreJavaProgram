package com.santosh.model;

import java.util.Date;

import com.santosh.collection.Customer;

public class Orders {
	
	private Long id;
	private int orderNumber;
	private Date date;
	private String thali;
	private int totalthali;
	private Customer customer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getThali() {
		return thali;
	}
	public void setThali(String thali) {
		this.thali = thali;
	}
	public int getTotalthali() {
		return totalthali;
	}
	public void setTotalthali(int totalthali) {
		this.totalthali = totalthali;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}