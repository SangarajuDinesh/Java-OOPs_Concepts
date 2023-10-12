package com.kn.Upcasting;

public class Geometry 
{
	public void doActivity(Shape sh)
	{
		sh.draw();
		System.out.println(sh.calculateArea());
		if(sh instanceof Rectangle)
		{
			System.out.println(((Rectangle)(sh)).perimeter());
		}
		else if(sh instanceof Circle)
		{
			System.out.println(((Circle)(sh)).perimeter());
		}
		else
		{
			System.out.println(((Square)(sh)).perimeter());
		}
		System.out.println("==========================================");
	}
}
