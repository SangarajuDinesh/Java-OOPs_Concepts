package com.kn.Upcasting;

public class Circle extends Shape 
{
	double r=5.5;
	public void draw() 
	{
		System.out.println("Drawing Circle");
	}
	public double calculateArea() 
	{
		return Math.PI *r*r ;
	}
	//specific Method well known to child only
	public double perimeter()
	{
		return 2*Math.PI*r;
	}
}
