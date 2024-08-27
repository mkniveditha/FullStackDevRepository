package com.gentech.parameterisedconstructor;

class Student
{
	String Studentname;
	int usn;
	Student(String name, int code )
	{
		Studentname=name;
		usn=code;
		System.out.println("Student name:"+Studentname);
		System.out.println("usn:"+usn);
		System.out.println("***********");
	}
}

class Library
{
	String bookname;
	int bookid;
	Library(String name, int id)
	{
		bookname=name;
		bookid=id;
		System.out.println("Book name: "+bookname);
		System.out.println("Book id: "+bookid);
		System.out.println("***********");
	}
}

class Sports
{
	String sportname;
	int studentid;
	Sports(String name, int id)
	{
		sportname=name;
		studentid=id;
		System.out.println("sport name: "+sportname);
		System.out.println("student id: "+studentid);
		System.out.println("***********");
	}

}

class Laboratory
{
	String LabName;
	int Labcode;
	Laboratory(String Name, int code)
	{
		LabName=Name;
		Labcode=code;
		System.out.println("Lab name: "+LabName);
		System.out.println("Lab code: "+Labcode);
		System.out.println("***********");

	}
}

public class ArgsCollege {

	public static void main(String[] args) {
		Student std=new Student("Niv", 98);
		Library lib=new Library("Python", 20);
		Sports spo=new Sports("Cricket", 21);
		Laboratory lab=new Laboratory("DSP Lab", 12);

	}

}
