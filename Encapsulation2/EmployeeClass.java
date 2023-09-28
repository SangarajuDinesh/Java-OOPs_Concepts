package com.kn.Encapsulation2;

import java.util.Scanner;

public class EmployeeClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Id = ");
		int id=sc.nextInt();
		System.out.print("Enter the Name = ");
		String name=sc.next();
		System.out.print("Enter the Marks = ");
		double salary=sc.nextDouble();
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.output();
		sc.close();
		

		
	}
}
