package com.gentech.test;
class Table
{
	static int display()
	{
		int sum=0;
		for(int i=1; i<=10; i++)
		{
			
			sum=sum+(2*i);
		}
		return sum;
	}
}
public class Test6 {

	public static void main(String[] args) {
		int c=Table.display();
		System.out.println(c);
	}

}
