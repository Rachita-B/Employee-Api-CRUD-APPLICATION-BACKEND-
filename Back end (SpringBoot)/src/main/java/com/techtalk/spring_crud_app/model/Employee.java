package com.techtalk.spring_crud_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private int salary;
	
   
    public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
    public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
    public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
    public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email=email;
	}
	
	
	public int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	public void setSalary(int salary) {
		// TODO Auto-generated method stub
		
		this.salary=salary;
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
