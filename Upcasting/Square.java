package com.kn.Upcasting;

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
	//specific Method well known to child only
		public double perimeter()
		{
			double r=5.5;
			return 2*Math.PI*r;
		}
}
