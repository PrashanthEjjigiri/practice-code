package com.java;

public class Employee {
private int id;
private String firstName;
private String lastname;
private String email;
private String city;
private int age;
private String gender;
private Long salary;
public Employee(int id, String firstName, String lastname, String email, String city, int age, String gender,
		Long salary) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastname = lastname;
	this.email = email;
	this.city = city;
	this.age = age;
	this.gender = gender;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", email=" + email + ", city="
			+ city + ", age=" + age + ", gender=" + gender + ", salary=" + salary + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Long getSalary() {
	return salary;
}
public void setSalary(Long salary) {
	this.salary = salary;
}

}
