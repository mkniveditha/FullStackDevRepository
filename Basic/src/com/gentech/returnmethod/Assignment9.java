package com.gentech.returnmethod;
class Table
{
	int method9(int a, int k)
	{

		return a*k;
	}
}
public class Assignment9 {

	public static void main(String[] args) {
		Table obj= new Table();
		int k=5;
		int b;
		for (int i=1; i<=10; i++)
		{
			b=obj.method9(i,k);
			System.out.println(k + "*" + i + "=" + b );

		}


	}

}
