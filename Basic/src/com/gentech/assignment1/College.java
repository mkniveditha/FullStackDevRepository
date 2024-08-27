package com.gentech.assignment1;

class Student
{
	String Studentname;
	int usn;
	Student()
	{
		Studentname="Niveditha";
		usn=79;
		System.out.println("Student name:"+Studentname);
		System.out.println("usn:"+usn);
		System.out.println("***********");
	}
}

class Library
{
	String bookname;
	int bookid;
	Library()
	{
		bookname="java";
		bookid=12;
		System.out.println("Book name: "+bookname);
		System.out.println("Book id: "+bookid);
		System.out.println("***********");
	}
}

class Sports
{
	String sportname;
	int studentid;
	Sports()
	{
		sportname="Football";
		studentid=5;
		System.out.println("sport name: "+sportname);
		System.out.println("student id: "+studentid);
		System.out.println("***********");
	}

}

class Laboratory
{
	String LabName;
	int Labcode;
	Laboratory()
	{
		LabName="ADC Lab";
		Labcode=20;
		System.out.println("Lab name: "+LabName);
		System.out.println("Lab code: "+Labcode);
		System.out.println("***********");

	}
}
public class College {

	public static void main(String[] args) {
		Student std=new Student();
		Library lib=new Library();
		Sports spo=new Sports();
		Laboratory lab=new Laboratory();




	}

}
