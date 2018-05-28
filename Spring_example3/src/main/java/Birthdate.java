package main.java;

import main.interfaces.myDate;

public class Birthdate implements myDate{
	private int day;
	private int month;
	private int year;
	Birthdate()
	{
		System.out.println("Default Constructor");
	}
	Birthdate(int day)
	{
		this.day=day;
		System.out.println("Birthday :"+day);
	}
	Birthdate(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void show(){
		System.out.println(day+"/"+month+"/"+year);
	}
}
