package main.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import main.interfaces.myDate;

public class employee {
private myDate birthdate;
private String firstName;
private String lastName;

public employee()
{
	
}
public employee(myDate birthdate)
{
	this.birthdate=birthdate;
}


public myDate getBirthdate() {
	return birthdate;
}
@Autowired
@Qualifier("asd")
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
	System.out.println("First name :"+firstName+" Last Name :"+ lastName+"Birthdate Month :"+birthdate.getDay()+"/"+birthdate.getMonth()+"/"+birthdate.getYear());
	return "First name :"+firstName+" Last Name :"+ lastName+"Birthdate Month :"+birthdate.getMonth();
}
	
}
