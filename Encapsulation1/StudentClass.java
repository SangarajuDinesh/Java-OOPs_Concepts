package com.kn.Encapsulation1;

import java.util.Scanner;

public class StudentClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name = ");
		String a=sc.next();
		System.out.print("Enter the Age = ");
		int b=sc.nextInt();
		System.out.print("Enter the Gender = ");
		String c=sc.next();
		System.out.print("Enter the Marks = ");
		int d=sc.nextInt();
			Student s=new Student();
			s.setAge(b);
			s.setGender(c);
			s.setName(a);
			s.setMarks(d);
			s.output();
			sc.close();
	}
}
