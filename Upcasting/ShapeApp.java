package com.kn.Upcasting;

public class ShapeApp 
{
	public static void main(String[] args)
	{
		Geometry g=new Geometry();
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		g.doActivity(s);
		g.doActivity(r);
		g.doActivity(c);
	}
}
