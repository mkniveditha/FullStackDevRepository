package com.gentech.outerinner;
class Outer2
{
	int age;
	Inner2b i1=new Inner2b();
	Inner2a i=new Inner2a();
	void showAge()
		{
			age=20;
			System.out.println("age:"+age);
		}
	
	
	private class Inner2a
	{
		String firstName;
	}
	private class Inner2b
	{
		String lastName;
		
	}
	public void showfirstName()
	{
		i.firstName="Niveditha";
		System.out.println("first name:"+i.firstName);
	}
	public void showlastName()
	{
		i1.lastName="M k";
		System.out.println("lastname:"+i1.lastName);
	}
	
}

public class Assignment3 {

	public static void main(String[] args) {
		Outer2 o2=new Outer2();
		
		o2.showfirstName();
		o2.showlastName();
		o2.showAge();
	}

}
