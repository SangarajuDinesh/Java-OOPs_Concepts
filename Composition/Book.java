package com.kn.Composition;

public class Book
{
	Page page;

	public Book(String content)
	{
		this.page = new Page(content);
	}
	public void read() 
	{
		System.out.println("Read the book");
	}
	
}
