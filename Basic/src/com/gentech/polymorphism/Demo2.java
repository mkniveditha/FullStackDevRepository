package com.gentech.polymorphism;
abstract class Maths
{
	abstract void Arithmetic();
}

class Addition extends Maths
{
	void Arithmetic()
	{
		int a=10;
		int b=20;
		System.out.println("Addition : " + (a+b));
	}
}

class Subtraction extends Maths
{
	void Arithmetic()
	{
		int a=50;
		int b=30;
		System.out.println("Subtraction : " + (a-b));
	}
}

class Multiplication extends Maths
{
	void Arithmetic()
	{
		int a=10;
		int b=50;
		System.out.println("Multiplication : " + (a*b));
	}
}

class Division extends Maths
{
	void Arithmetic()
	{
		int a=60;
		int b=6;
		System.out.println("Division : " + (a/b));
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Maths maths=null;
		
		Addition a=new Addition();
		Subtraction s=new Subtraction();
		Multiplication m=new Multiplication();
		Division d=new Division();
		
		maths=a;
		maths.Arithmetic();
		
		maths=s;
		maths.Arithmetic();
		
		maths=m;
		maths.Arithmetic();		
		
		maths=d;
		maths.Arithmetic();	
	}

}
