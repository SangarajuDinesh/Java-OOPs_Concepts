package com.kn.Composition;

public class BookPage
{
	public static void main(String[] args)
	{
		Book b=new Book("Page #1 has introduction");
		b.read();
		b=null;
		
	}
}
