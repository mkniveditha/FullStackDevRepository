package com.gentech.outerinner;
class Outer
{
	String firstName;
	Inner inner=new Inner();
	public void display()
	{
		String firstName = "Niveditha";
		System.out.println("FirstName:"+firstName);
	}

	private class Inner

	{
		int age;
	}
		void boll()
		{
			inner.age=23;
			System.out.println("Age:"+inner.age);
		}
	

}

public class Assignment1 {

	public static void main(String[] args) {
		Outer o1=new Outer();

		o1.boll();
		o1.display();
	}

}
