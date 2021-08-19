package com.shubham.oops;

class Employee{
	String name;
	String empId;
	Address address;//Aggregation(Loosely Coupled)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", address=" + address.city +", "+ address.state +", "+address.country + "]";
	}
	
	
}

class Address{
	String city;
	String state;
	String country;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}

public class AggregationExample {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Shubham");
		emp.setEmpId("SHU01");
		
		Address address = new Address();
		address.setCity("Cuttack");
		address.setState("Orissa");
		address.setCountry("India");
		
		emp.setAddress(address);
		
		System.out.println(emp.toString());
	}
}
