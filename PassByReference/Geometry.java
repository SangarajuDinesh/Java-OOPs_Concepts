package com.kn.PassByReference;

public class Geometry
{
	public void doActivity(Shape sh)
	{
		sh.draw();
		double d=sh.calculateArea();
		System.out.println(d);
	}
}
