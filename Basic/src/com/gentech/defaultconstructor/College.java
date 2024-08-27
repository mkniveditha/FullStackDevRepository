package com.gentech.defaultconstructor;
class Student
{
	String name;
	int id;

}
class Library
{
	String name;
	int id;
}
class Sports
{
	String name;
	int playerid;
}

class Laboratory
{
	String name;
	int Labcode;
}

public class College {

	public static void main(String[] args) {
		Student stu=new Student();
		stu.name="Nivi";
		stu.id=52;
		System.out.println("name:" +stu.name);
		System.out.println("id:" +stu.id  );
		System.out.println("------------------------");


		Library lib=new  Library();
		lib.name="Deptlibrary";
		lib.id=18;
		System.out.println("Library Name:" +lib.name);
		System.out.println("id:" +lib.id   );
		System.out.println("------------------------");


		Sports spo=new Sports();
		spo.name="Kho-Kho";
		spo.playerid=18;
		System.out.println("sports name:" +spo.name  );
		System.out.println("sports players number:" +spo.playerid );
		System.out.println("------------------------");

		Laboratory com=new Laboratory();
		com.name="JavaLab";
		com.Labcode=50;
		System.out.println("lab name:" +com.name  );
		System.out.println("sports players number:" +com.Labcode );
		System.out.println("------------------------");


	}

}
