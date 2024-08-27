package com.gentech.defaultconstructor;

class Emp
{
	String Empname;
	int Empage;
	int Empid;
}

class Insurance
{
	String insurancetype;
	int insuranceid;
}

class Department
{
	int deptid;
	String deptname;
}


public class Company {

	public static void main(String[] args) {

		Emp emp = new Emp();
		emp.Empname="Rakesh";
		emp.Empage=23;
		emp.Empid=98;
		System.out.println("Employee name : " + emp.Empname);
		System.out.println("age - " + emp.Empage);
		System.out.println("id - " + emp.Empid);
		System.out.println("------------------------");

		Insurance insu=new Insurance();
		insu.insurancetype="Medical";
		insu.insuranceid=8;
		System.out.println("insurance :  "  +insu.insurancetype);
		System.out.println("insuranceid :  " + insu.insuranceid);
		System.out.println("------------------------");

		Department dept=new Department();
		dept.deptid=1;
		dept.deptname="Full Stack developer";
		System.out.println("department id : " + dept.deptid);
		System.out.println("department name:  " +dept.deptname );
		System.out.println("------------------------");   



	}

}
