package com.kn.PassByReference;

public class Circle extends Shape 
{
	public void draw() 
	{
		System.out.println("Drawing Circle");
	}
	public double calculateArea() 
	{
		double r=5.5;
		return Math.PI*r*r ;
	}
}
