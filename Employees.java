package com.demo;



import jakarta.persistence.*;


@Entity
public class Employees {
	
	@Id
	private int emp_id;
	private String f_name;
	private String l_name;
	private int salary;
	public Employees(int emp_id, String f_name, String l_name, int salary) {
		super();
		this.emp_id = emp_id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.salary = salary;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [emp_id=" + emp_id + ", f_name=" + f_name + ", l_name=" + l_name + ", salary=" + salary + "]";
	}
	

	

}
