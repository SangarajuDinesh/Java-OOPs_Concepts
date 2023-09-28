package com.kn.HeirachialInheritance;

import java.util.Scanner;

public class HeirarchailInheritanceDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("Employee Name = "+emp.name);
		System.out.println("Employee Salary = "+emp.salary);
		System.out.println("---------------------------------");
		Developer dev=new Developer();
		System.out.println("Developer name = ");
		dev.name=sc.next();
		System.out.println("Developer Salary = ");
		dev.salary=sc.nextInt();;
		System.out.println("Developer name = "+dev.name);
		System.out.println("Developer Salary = "+dev.salary);
		System.out.println("---------------------------------");
		TestEngineer te=new TestEngineer();
		System.out.println("TestEngineer Name = ");
		te.name=sc.next();
		System.out.println("TestEngineer Salary = ");
		te.salary=sc.nextInt();
		System.out.println("TestEngineer Name = "+te.name);
		System.out.println("TestEngineer Salary = "+te.salary);
		System.out.println("---------------------------------");
		Manager mn=new Manager();
		System.out.println("Manager Name = ");
		mn.name=sc.next();
		System.out.println("Manager salary = ");
		mn.salary=sc.nextInt();
		System.out.println("Manager Name = "+mn.name);
		System.out.println("Manager salary = "+mn.salary);
		System.out.println("---------------------------------");
		TeamLead tl=new TeamLead();
		System.out.println("TeamLead Name = ");
		tl.name=sc.next();
		System.out.println("TeamLead Salary = ");
		tl.salary=sc.nextInt();
		System.out.println("TeamLead Name = "+tl.name);
		System.out.println("TeamLead Salary = "+tl.salary);
		sc.close();

	}
}
