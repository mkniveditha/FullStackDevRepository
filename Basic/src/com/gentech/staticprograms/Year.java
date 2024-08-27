package com.gentech.staticprograms;
class Leap
{
	static int year=2012;
	static 
	{
		display();
	}


	static boolean display()
	{
		if(((year%4==0) && (year%100!=0)) || (year%400==0))

		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=Leap.display();
		System.out.println(b);
	}

}
