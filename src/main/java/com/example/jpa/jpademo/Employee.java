package com.example.jpa.jpademo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Entity
public class Employee {
	@Id
	private int eid;
	private String name;
	/*@Autowired
	private Laptop lap;
	
	
	
	public Laptop getLap() {
		return lap;
	}


	public void setLap(Laptop lap) {
		this.lap = lap;
	}
*/

	public Employee() {
		super();
		System.out.println("object created");
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}

	

	/*public void show(){
		System.out.println(" in show");
		lap.compile();
	}*/
}
