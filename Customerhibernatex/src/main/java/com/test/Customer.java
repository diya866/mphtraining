package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String c_name;
private String c_city;
private String c_company;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public String getC_city() {
	return c_city;
}
public void setC_city(String c_city) {
	this.c_city = c_city;
}
public String getC_company() {
	return c_company;
}
public void setC_company(String c_company) {
	this.c_company = c_company;
}


}
