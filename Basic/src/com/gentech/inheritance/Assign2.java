package com.gentech.inheritance;
class Company
{
	String name;
	Company(String n)
	{
		name=n;
	}
	Company()
	{
		System.out.println("This is a no args Constructor");
	}
	void display()
	{
		System.out.println(name);
	}
	
}
class Employee1 extends Company
{
	int empId;
	String empName;
	Employee1(String n, int i, String ename)
	{
		super(n);
		empId=i;
		empName=ename;
		
	}
	
	void display()
	{
		super.display();
		System.out.println(empId);
		System.out.println(empName);
	}
}
class EmployeeJob1 extends Employee1
{
	String role;
	int experience;
	EmployeeJob1(String n, int i, String ename, String r, int ex)
	{
		super(n,i, ename);
		role=r;
		experience=ex;
	}
	
	void display()
	{
		super.display();
		System.out.println(role);
		System.out.println(experience);
	}
	
}
public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeJob1 emp=new EmployeeJob1("hii", 12, " btee", "he", 45);
		emp.display();
	}

}
