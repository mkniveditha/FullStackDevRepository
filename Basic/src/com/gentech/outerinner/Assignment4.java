package com.gentech.outerinner;
class Outer3
{
	String name;
	Inner4a inner4a=new Inner4a();
	Inner4b inner4b=new Inner4b();
	void showMarks1()
	{
		inner4a.marks1=85;
		System.out.println("Marks1 = "+inner4a.marks1);
	}
	void showMarks2()
	{
		inner4b.marks2=75;
		System.out.println("Marks2 = "+inner4b.marks2);
	}

	static class Inner4a
	{
		int marks1;
	}
	static class Inner4b
	{
		int marks2;
	}
	void showName()
	{
		name="Deepika";
		System.out.println("name:"+name);
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		Outer3 o3=new Outer3();
		o3.showName();
		o3.showMarks1();
		o3.showMarks2();
	}

}
