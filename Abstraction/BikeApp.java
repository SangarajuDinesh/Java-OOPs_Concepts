package com.kn.Abstraction;

public class BikeApp 
{
	public static void main(String[] args)
	{
		Bike b=new Pulsar();
		b.refuel();
		b=new Honda();
		b.refuel();
		
	}
}
