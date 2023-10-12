package com.kn.TightAndLooseCoupling;

public class Engineer 
{
	public void display(SoftwareEngineer se)
	{
		se.attendMeeting();
		se.writeTestCase();
		
		if(se instanceof DatabaseEngineer)
		{
			((DatabaseEngineer)(se)).doDatabaseProject();
			((DatabaseEngineer)(se)).learnSQL();;
		}
		else if(se instanceof JavaBackendEngineer)
		{
			((JavaBackendEngineer)(se)).doBackendProject();
			((JavaBackendEngineer)(se)).learnJava();
		}
		else if(se instanceof PythonBackendEngineer)
		{
			((PythonBackendEngineer)(se)).doBackendProject();
			((PythonBackendEngineer)(se)).learnPython();
		}
		else if(se instanceof BackendEngineer)
		{
			((BackendEngineer)(se)).doBackendProject();
		}
	}
}
