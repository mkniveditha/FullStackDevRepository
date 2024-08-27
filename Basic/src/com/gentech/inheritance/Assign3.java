package com.gentech.inheritance;
class School
{
	String name;
	School(String n)
	{
		name=n;
	}
	void display()
	{
		System.out.println(name);
	}
}
class ClassRoom extends School
{
	int room;
	ClassRoom(String n, int r)
	{
		super(n);
		room=r;
	}
	void show()
	{
		super.display();
		System.out.println(room);
	}
}
class Dept extends School
{
	String deptname;
	Dept(String n, String dname)
	{
		super(n);
		deptname=dname;
	}
	void hello()
	{
		super.display();
		System.out.println(deptname);
	}
}
class Course2 extends Dept
{
	String cname;
	Course2(String n, String dname, String cn )
	{
		super(n, dname);
		cname=cn;
	}
	void byee()
	{
		super.hello();
		System.out.println(cname);
	}
}
public class Assign3 {

	public static void main(String[] args) {
		ClassRoom c=new ClassRoom("NCS", 12);
		Course2 c2=new Course2("nivi", "ece", "kannada");
		c.show();
		c2.byee();
		
		
	}

}
