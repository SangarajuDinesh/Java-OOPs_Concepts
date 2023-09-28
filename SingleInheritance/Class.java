package com.kn.SingleInheritance;

import java.util.Scanner;

public class Class 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name = ");
		String name=sc.next();
		System.out.println("Enter the Colour = ");
		String colour=sc.next();
		BabyDog bd=new BabyDog();
		bd.name=name;
		bd.colour=colour;
		System.out.println(bd.name);
		System.out.println(bd.colour);
		bd.bark();
		bd.eat();
		bd.walk();
		sc.close();
	}
}
