package com.kn.MethodHiding;

public class Main 
{
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.display();
		Child c=new Child();
		c.display();
		Parent p1=new Child();
		p1.display();
	}
}
