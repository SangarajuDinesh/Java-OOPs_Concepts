package com.kn.Aggregation;

public class Airlines
{
	String name;
	Pilot pilot;
	public void operate() 
	{
		System.out.println(this.name+" is operating the Airlines now...");
		System.out.println(pilot.name+" is flying now..");
		pilot.fly();
	}
	public Airlines(String name, Pilot pilot) 
	{
		this.name = name;
		this.pilot = pilot;
	}
	
}
