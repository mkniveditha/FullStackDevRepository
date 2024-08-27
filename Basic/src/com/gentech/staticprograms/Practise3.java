package com.gentech.staticprograms;
class IsPrime1
{
	
	
	
	{
		int num=12;
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
			System.out.println(num+ " is a prime");
		}
		else
		{
			System.out.println(num+ " not is a prime");
		}
	}
}
public class Practise3 {

	public static void main(String[] args) {
		IsPrime1 i=new IsPrime1();

	}

}
