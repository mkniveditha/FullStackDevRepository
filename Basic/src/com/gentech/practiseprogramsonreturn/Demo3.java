package com.gentech.practiseprogramsonreturn;
class Factorial
{
	void method(int num)
	{
		int fact=1;
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
			System.out.println(fact);		
		}
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.method(5);

	}

}
