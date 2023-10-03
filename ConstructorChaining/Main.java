package com.kn.ConstructorChaining;

public class Main
{
	public static void main(String[] args) 
	{
		Demo2 d2=new Demo2(5);
		Object obj=new Object(5);
		System.out.println(d2.i+" "+obj.i);
	}
}
