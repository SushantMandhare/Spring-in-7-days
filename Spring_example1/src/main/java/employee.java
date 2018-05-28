package main.java;

import main.interfaces.myDate;

public class employee {
private myDate birthdate;
private String firstName;
private String lastName;

public myDate getBirthdate() {
	return birthdate;
}
public void setBirthdate(myDate birthdate) {
	this.birthdate = birthdate;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String toString(){
	System.out.println("First name :"+firstName+" Last Name :"+ lastName+"Birthdate Month :"+birthdate.getMonth());
	return "First name :"+firstName+" Last Name :"+ lastName+"Birthdate Month :"+birthdate.getMonth();
}
	
}
