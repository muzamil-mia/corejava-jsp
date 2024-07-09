package java8.predefinedFunctionalInterfaces;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private double sal;
	private String gender;
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.getId() == emp.getId();
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}
