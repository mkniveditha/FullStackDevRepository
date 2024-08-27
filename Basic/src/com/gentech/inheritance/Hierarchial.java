package com.gentech.inheritance;
class Employee
{
	void display()
	{
		System.out.println("Work at Infosys");
	}
}
class EmployeeID extends Employee
{
	void eid()
	{
		System.out.println("1024");
	}
}
class EmployeeName extends Employee
{
	void ename()
	{
		System.out.println("unknown");
	}
	
}
class EmployeeJob extends Employee
{
	void jobname()
	{
		System.out.println("Software Engineer");
	}
}
public class Hierarchial {
	public static void main (String args[])
	{
		EmployeeID e1=new EmployeeID();
		EmployeeName e2=new EmployeeName();
		EmployeeJob e3=new EmployeeJob();
		
		e1.display();
		e1.eid();
		
		e2.display();
		e2.ename();
		
		e3.display();
		e3.jobname();
		
	}

}
