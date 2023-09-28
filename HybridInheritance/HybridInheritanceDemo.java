package com.kn.HybridInheritance;

public class HybridInheritanceDemo 
{
	public static void main(String[] args) 
	{
		EngineeringStudent es=new EngineeringStudent("Dinesh");
		System.out.println("Engineering Student = "+es.name);
		MedicalStudent ms=new MedicalStudent();
		ms.name="Mahesh";
		System.out.println("Medical Student = "+ms.name);
		JavaTrainer jt=new JavaTrainer();
		jt.name="Suresh";
		System.out.println("Java Trainer = "+jt.name);
		SQLTrainer st=new SQLTrainer();
		st.name="Sekhar";
		System.out.println("SQL Trainer = "+st.name);
	
	}
}
