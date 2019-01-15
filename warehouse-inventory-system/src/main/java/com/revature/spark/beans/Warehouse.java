package com.revature.spark.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Warehouse {

	@Id
	@Column(name="warehouse_id")
	private int id;
	
	@Column(name="warehouse_name")
	private String name;
	
	@Column
	private String address;
	
	public Warehouse() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Warehouse [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
