package main.java;

import org.springframework.stereotype.Component;

import main.interfaces.myDate;

public class Birthdate implements myDate{
	private int day;
	private int month;
	private int year;
	public Birthdate(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

}
