package com.kn.ThisAndSuper;

public class Child extends Parent
{
	String name="Patlu";
	int age=33;
	public Child()
	{
		super();
		System.out.println("No args Constructor");
	}
	public Child(String name,int age)
	{
		this(age);
		System.out.println("before");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println("2 args construtor");
		this.name=name;
		this.age=age;
		System.out.println(this.name);
		System.out.println(this.age);
	}
	public Child(int age)
	{
		super();
		this.age=age;
	}
}
