package com.gentech.staticprograms;
class Factorial
{
	static int a=5;

	static	
	{
		int fact=0;
		for(int i=1;i<=a; i++) 
		{
			fact=i*i*i;
		}
		System.out.println(fact);

	}
}
public class Practise12 {

	public static void main(String[] args) {
		Factorial f=new Factorial();

	}

}
