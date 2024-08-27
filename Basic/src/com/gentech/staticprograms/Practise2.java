package com.gentech.staticprograms;
class IsPrime
{
    static int num;
	static boolean display(int num)
	{
		int x=0;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				x=x+1;
				break;
			}
		}
		if(x==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
			
			
	}
}
public class Practise2 {

	public static void main(String[] args) {
		boolean b=IsPrime.display(12);
		System.out.println(b);
	}

}
