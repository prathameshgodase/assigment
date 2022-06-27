package Que16Item;

import java.time.LocalDate;

public class Employee {
    String name ;
    LocalDate dob;
    LocalDate doj;
    LocalDate dor;
    String location;
    String depaerment;
    double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public LocalDate getDor() {
		return dor;
	}
	public void setDor(LocalDate dor) {
		this.dor = dor;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDepaerment() {
		return depaerment;
	}
	public void setDepaerment(String depaerment) {
		this.depaerment = depaerment;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, LocalDate dob, LocalDate doj, LocalDate dor, String location, String depaerment,
			double salary) {
		super();
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.dor = dor;
		this.location = location;
		this.depaerment = depaerment;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", doj=" + doj + ", dor=" + dor + ", location=" + location
				+ ", depaerment=" + depaerment + ", salary=" + salary + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}