package com.gentech.abstractclass;
abstract class Maths1
{
	abstract void display1(int a, int b);
	
	abstract void display(int a, int b);
	
}
class Maths2 extends Maths1
{
	void display1(int a, int b)
	{
		System.out.println(a+b);
	}
	void display(int a, int b)
	{
		System.out.println(a*b);
	}
}
public class Practise1 {

	public static void main(String[] args) {
		Maths2 m2=new Maths2();
		m2.display1(2, 3);
		m2.display(3, 4);
	}

}
