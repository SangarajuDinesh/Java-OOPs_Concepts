package com.kn.Aggregation;

public class Aggregation 
{
	public static void main(String[] args)
	{
		Pilot p= new Pilot("Stalone");
		Airlines air=new Airlines("Emirates", p);
		air.operate();
		System.out.println("-------------------");
		air=null;//shutting down the Owner object
		p.fly();//bu the owned object may work
		
	}
}
