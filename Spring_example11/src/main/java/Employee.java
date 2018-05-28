package main.java;

public class Employee {

	private String firstName;
	private String lastName;
	
	public Employee()
	{
		
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
	public String toString()
	{
		return "First name: "+firstName+" Last Name: "+ lastName;
	}
	public String DisplayInfo()
	{
		System.out.println("First name: "+firstName+" Last Name: "+ lastName);
		//int a=10/0;
		return "asd";
	}
	public String DisplayInfoByParam(String etc)
	{
		System.out.println(etc + "First name: "+firstName+" Last Name: "+ lastName);
		//int a=10/0;
		return "asd";
	}
}
