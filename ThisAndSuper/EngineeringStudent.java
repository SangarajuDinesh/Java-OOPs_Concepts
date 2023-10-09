package com.kn.ThisAndSuper;

public class EngineeringStudent extends Student
{
	String branch;
	int sem;
	public EngineeringStudent(String name, int age, String branch, int sem)
	{
		super(name, age);
		this.branch = branch;
		this.sem = sem;
		System.out.println(this.branch);
		System.out.println(this.sem);
		System.out.println("-------------------------");
	}
	
	public EngineeringStudent(String name, int age, String branch) {
		super(name, age);
		this.branch = branch;
		System.out.println(this.branch);
		System.out.println(this.sem);
		System.out.println("-------------------------");
	}
	
	public EngineeringStudent(String name, int age, int sem) {
		super(name, age);
		this.sem = sem;
		System.out.println(this.branch);
		System.out.println(this.sem);
		System.out.println("-------------------------");
	}
	public EngineeringStudent(String name,int age)
	{
		super(name,age);
		System.out.println(this.branch);
		System.out.println(this.sem);
	}
}
