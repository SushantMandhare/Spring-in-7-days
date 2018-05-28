package main.java;

public class Employee {
	private String empname;

	public Employee()
	{
		
	}
	public Employee(String empname)
	{
		this.empname=empname;
	}
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String toString()
	{
		return empname;
	}
}
