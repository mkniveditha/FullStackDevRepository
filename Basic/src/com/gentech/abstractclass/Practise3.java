package com.gentech.abstractclass;
abstract class Square
{
	static
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i*i);
		}
	}
}
class Result extends Square
{
	
}
public class Practise3 {

	public static void main(String[] args) {
		Result r=new Result();
	}

}
