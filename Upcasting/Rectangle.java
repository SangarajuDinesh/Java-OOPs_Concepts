package com.kn.Upcasting;

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
	//specific Method well known to child only
		public double perimeter()
		{
			double r=5.5;
			return 2*Math.PI*r;
		}
}
