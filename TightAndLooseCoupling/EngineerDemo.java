package com.kn.TightAndLooseCoupling;

public class EngineerDemo
{
	public static void main(String[] args) 
	{
		System.out.println("============Tight coupling===========");
		SoftwareEngineer se=new SoftwareEngineer();
		se.attendMeeting();
		se.writeTestCase();
		System.out.println();
		BackendEngineer be=new BackendEngineer();
		be.attendMeeting();
		be.writeTestCase();
		be.doBackendProject();
		System.out.println();
		DatabaseEngineer de=new DatabaseEngineer();
		de.attendMeeting();
		de.writeTestCase();
		de.doDatabaseProject();
		de.learnSQL();
		System.out.println();
		JavaBackendEngineer je=new JavaBackendEngineer();
		je.attendMeeting();
		je.writeTestCase();
		je.doBackendProject();
		je.learnJava();
		System.out.println();
		PythonBackendEngineer pe=new PythonBackendEngineer();
		pe.attendMeeting();
		pe.writeTestCase();
		pe.doBackendProject();
		pe.learnPython();
		System.out.println("==============Loose Coupling============");
		Engineer e=new Engineer();
		e.display(se);
		System.out.println();
		e.display(be);
		System.out.println();
		e.display(de);
		System.out.println();
		e.display(je);
		System.out.println();
		e.display(pe);
		
	}
}
