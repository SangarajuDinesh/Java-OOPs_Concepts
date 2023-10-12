package com.kn.PassByReference;

public class Square extends Shape 
{
	public void draw() 
	{
		System.out.println("Drawing Square");
	}
	public double calculateArea() 
	{
		double a=5.5;
		return Math.pow(a, 2);
	}
}
