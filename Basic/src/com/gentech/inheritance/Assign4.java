package com.gentech.inheritance;
class Maths1
{
	void display(int a, int b)
	{
		System.out.println(a+b);
	}
}
class Maths2 extends Maths1
{
	void display(int a, int b)
	{
		super.display(a, b);
		System.out.println(a-b);
	}
}
class Maths3 extends Maths2
{
	void display(int a, int b)
	{
		super.display(a, b);
		System.out.println(a*b);
	}
}
public class Assign4 {

	public static void main(String[] args) {
		Maths3 m=new Maths3();
		m.display(2, 3);

	}

}
