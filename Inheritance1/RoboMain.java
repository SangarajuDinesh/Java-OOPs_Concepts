package com.kn.Inheritance1;

import java.util.Scanner;

public class RoboMain 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name  = ");
		String name=sc.next();
		System.out.println("Enter the Type = ");
		String type=sc.next();
		TeacherRobo tr=new TeacherRobo(name,type);
		System.out.println(tr.name);
		System.out.println(tr.type);
		tr.teach();
		tr.charge();
		tr.talk();
		tr.walk();
		sc.close();
		
	}
}
