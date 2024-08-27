package com.gentech.inheritance;
class College
{
	String name;
	String address;
	College(String n, String a)
	{
		name=n;
		address=a;
	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(address);
	}
}
class Department1 extends College
{
	String deptName;
	Department1(String n, String a, String d)
	{
		super(n,a);
		deptName=d;
	}
	void display()
	{
		super.display();
		System.out.println(deptName);
	}
	
}
class Course  extends Department1
{
	int courseId;
	Course(String n, String a, String d, int c)
	{
		super(n, a, d);
		courseId=c;
		super.display();
	}
	void hello()
	{
		
		System.out.println(courseId);
	}
}
public class Assign1 {

	public static void main(String[] args) {
		Course c=new Course("PESCE", "Mandya", "ECE", 123);
	    c.display();

	}

}
