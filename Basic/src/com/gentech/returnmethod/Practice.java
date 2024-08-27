package com.gentech.returnmethod;
class Square1
{
	int[] method(int a, int b)
	{
		int res[]=new int[10];
		int k=0;
		for(int i=1; i<=10; i++)
		{
			res[k]=i*i;
			k++;
		}
		return res;
	}
}

public class Practice {

	public static void main(String[] args) {
		Square1 s=new Square1();
		int b[]=s.method(1,10);
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}

	}

}
