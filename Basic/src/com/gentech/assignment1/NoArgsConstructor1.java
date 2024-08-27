package com.gentech.assignment1;


class Employee
{
	String Empname;
	int age;

	Employee()
	{
		Empname = "Niveditha";
		age=22;
		System.out.println("Ename:  "+Empname);
		System.out.println("Age:  "+ age);
		System.out.println("+++++++++");

	}
}
class Department
{
	String Deptname;
	int Deptid;

	Department()
	{
		Deptname="ECE";
		Deptid=76;
		System.out.println("Deptname: "+Deptname);
		System.out.println("Deptid:  "+ Deptid);
		System.out.println("+++++++++");
	}
}

class Insurence
{
	String InsName;
	int Insid;

	Insurence()
	{
		InsName="Accident";
		Insid= 10;
		System.out.println("InsName: "+InsName);
		System.out.println("Insid:  "+Insid);
	}

}


public class NoArgsConstructor1 {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Department obj2 = new Department();
		Insurence obj3=new Insurence();

	}
}





