package com.gentech.parameterisedconstructor;


class Employee
{
   String Empname;
   int age;
   
   Employee(String name, int Age)
   {
     Empname = name;
	 age=Age;
	 System.out.println("Ename:  "+Empname);
	 System.out.println("Age:  "+ age);
	 System.out.println("+++++++++");

}
}
   class Department
	{
		String Deptname;
		int Deptid;
		
		 Department(String name, int id)
		 {
			 Deptname=name;
			 Deptid=id;
			 System.out.println("Deptname: "+Deptname);
			 System.out.println("Deptid:  "+ Deptid);
			 System.out.println("+++++++++");
		 }
	}
   
   class Insurence
	{
		String InsName;
		int Insid;
		
		Insurence(String name, int id)
		{
			 InsName=name;
			 Insid= id;
			 System.out.println("InsName: "+InsName);
			 System.out.println("Insid:  "+Insid);
		}
		
	}

public class Company {

	public static void main(String[] args) {
		Employee obj1 = new Employee("NIVI", 12);
		Department obj2 = new Department("CSE", 40);
		Insurence obj3=new Insurence("Accident", 23);


	}

}
