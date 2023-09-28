package com.kn.MultilevelInheritance;

public class MultilevelInheritanceDemo 
{
	public static void main(String[] args) 
	{
		Vehicle v=new Vehicle();
		v.regNumber=1111;
		System.out.println("Registration Number = "+v.regNumber);
		v.move();
		Car c=new Car();
		c.regNumber=2222;
		System.out.println("Registration Number = "+c.regNumber);
		c.move();
		Sedan s=new Sedan();
		s.regNumber=3333;
		System.out.println("Registration Number = "+c.regNumber);
		s.move();
	}
}
