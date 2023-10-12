package com.kn.PassByReference;

public class ShapeApp 
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		Square s=new Square();
		Circle c =new Circle();
		Geometry g=new Geometry();
		g.doActivity(r);
		g.doActivity(s);
		g.doActivity(c);
		
		
	}
}
