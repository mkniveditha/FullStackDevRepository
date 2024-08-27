package com.gentech.staticprograms;
class Odd
{
	static int a=1;
	static int b=50;
	
	static 
	{
		
		
		for(int i=a; i<=b; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
	    }
    }	
}
public class Practise5 {

	public static void main(String[] args) {
		Odd o=new Odd();

	}

}
