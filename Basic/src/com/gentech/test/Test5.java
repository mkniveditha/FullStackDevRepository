package com.gentech.test;
class Voting
{
	
	static String display()
	{
		int age=20;
		if(age>=18)
		{
			
			return  "eligible";
		}
		else
		{
			return "not eligible" ;
		}
	}
}
public class Test5 {

	public static void main(String[] args) {
		String c=Voting.display();
		System.out.println(c);

	}

}
