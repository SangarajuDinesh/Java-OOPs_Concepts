package com.kn.Abstraction;

public abstract class Bike 
{
	public void start()
	{
		System.out.println("Bike has Started....");
	}
	public void stop()
	{
		System.out.println("Bike has stopped....");
	}
	public abstract void refuel();
}
