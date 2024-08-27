package com.gentech.staticprograms;
class Even
{
	 
	
	{
		int num=10;
		showeven();
	}
	
	 void showeven()
	{   int num=10;
		if(num%2==0)
		{
			System.out.println(num + " is a even");
		}
		else
		{
			System.out.println(num + " not is a even");
		}
	}
}

public class Practise4 {

	public static void main(String[] args) {
		Even e=new Even();
	}

}
