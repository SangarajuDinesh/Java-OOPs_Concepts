package com.kn.ThisAndSuper;

public class ParentChildApp 
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		System.out.println(c.name);
		System.out.println(c.age);
		Child c1=new Child("Jatka",38);

	}
}
