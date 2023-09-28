package com.kn.Encapsulation1;

public class Student
{
	private String name;
	private int age;
	private String gender;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void output()
	{
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Gender = "+gender);
		System.out.println("Marks = "+marks);
	}
}
