package com.gentech.inheritance;

class Shape {
	int k;
	Shape(int a)
	{
		k=a;
	}
	
}

class Rect extends Shape {
	int k;
	Rect(int a,int b)
	{
		super(a);
		k=b;
		System.out.println(super.k);
	}

}

class Para extends Rect {
	int k;
	Para(int a,int b,int c)
	{
		super(a,b);
		k=c;
		System.out.println(super.k);
		System.out.println(k);
	}

}



public class Imp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Para p=new Para(1,2,3);
	}

}
