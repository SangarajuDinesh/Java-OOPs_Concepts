package com.kn.Composition;

public class Page
{
	String content;

	public Page(String content)
	{
		this.content = content;
	}
	public void display() 
	{
		System.out.println(this.content);
	}
	
}
