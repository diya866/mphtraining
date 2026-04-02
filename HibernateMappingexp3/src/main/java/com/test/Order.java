package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders1")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String O_name;
	private int O_price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getO_name() {
		return O_name;
	}

	public void setO_name(String o_name) {
		O_name = o_name;
	}

	public int getO_price() {
		return O_price;
	}

	public void setO_price(int o_price) {
		O_price = o_price;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", O_name=" + O_name + ", O_price=" + O_price + "]";
	}
}
