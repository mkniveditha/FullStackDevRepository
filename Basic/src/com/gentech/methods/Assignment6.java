package com.gentech.methods;
class Array6
{
	void method6()
	{
		for(int i=2; i<=20; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println("-------------------");
		}
	}
}
public class Assignment6 {

	public static void main(String[] args) {
		Array6 o=new Array6();
		o.method6();

	}
}
