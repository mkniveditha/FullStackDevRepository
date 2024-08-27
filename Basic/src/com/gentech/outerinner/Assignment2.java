package com.gentech.outerinner;
class Outer1
{
	int age;
	void showAge()
	{
		int age=22;
		System.out.println("age: "+age);
	}


	static class InnerStatic1
	{
		String name;
	
		void showName()
		{
			String name="Nivi";
			System.out.println("Name:"+name);
		}
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		Outer1 obj=new Outer1();
		obj.showAge();

		Outer1.InnerStatic1 inner=new Outer1.InnerStatic1();
		inner.showName();

	}

}
