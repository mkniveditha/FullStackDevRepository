package com.gentech.returnmethod;
class Factorial
{
	int method5(int a)
	{
		int fact=1;
		for(int i=1;i<=a; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		Factorial f1=new Factorial();
		int k=f1.method5(5);
		System.out.println(k);

	}

}




