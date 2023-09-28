package com.kn.Inheritance1;

public class TeacherRobo extends Robo 
{
	public TeacherRobo(String name, String type) 
	{
		this.name=name;
		this.type=type;
	}

	public void teach()
	{
		System.out.println("TeacherRobo can Teach......");
	}
}
