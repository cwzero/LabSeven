package com.liquidforte.java.labseven;

public class Date {
	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void displayDate() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}
}
