package com.kn.Encapsulation2;

public class Employee 
{
	private int id;
	private String name;
	private double salary;
	private String teamName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public void output()
	{
		if(id>=1 && id<=50)
		{
			teamName="Team-1";
		}
		else if(id>=51 && id<=100)
		{
			teamName="Team-2";
		}
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
		System.out.println("Team Name = "+teamName);
	}
	
}
