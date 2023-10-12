package com.kn.PassByReference;

public class Rectangle extends Shape 
{
	public void draw() 
	{
		System.out.println("Drawing Rectangle");
	}
	public double calculateArea() 
	{
		double l=5.5;
		double b=5.5;
		return l*b;
	}
}
