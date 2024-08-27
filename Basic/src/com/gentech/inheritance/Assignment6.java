package com.gentech.inheritance;
class Employeee
{
	String empname;
	Employeee(String empname)
	{
		this.empname=empname;
		System.out.println("Employee name :"+empname);
	}
}
class Jobname extends Employeee
{
	String jobname;
	Jobname(String jobname,String empname)
	{
		super(empname);
		this.jobname=jobname;
	}
	void displayjobname()
	{
		System.out.println("Job name: "+jobname);
	}
}
class Address extends Employeee
{
	String address;
	Address(String address,String empname)
	{
		super(empname);
		this.address=address;
	}
	void displayaddress()
	{
		System.out.println("Employee Address is: "+address);
	}
}
class Department extends Jobname
{
	String deptname;
	Department(String empname,String jobname,String deptname)
	{
		super(jobname,empname);
		this.deptname=deptname;
	}
	void displayDeptname()
	{
		System.out.println("Employee belongs to the department of: "+deptname);
		super.displayjobname();
	}
}


public class Assignment6 {

	public static void main(String[] args) {
		Department d=new Department("Santosh","Manager","Accountant");
		d.displayDeptname();
		System.out.println("+++++++++++++++++++++++++++");
		Address a=new Address("Vijaynagar metro station","Santosh");
		a.displayaddress();

	}

}
