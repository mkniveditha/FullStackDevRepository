package com.gentech.returnmethod;
class ArraySum
{
	int method2(int a[])
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum += a[i];
		}
		return sum;
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		ArraySum a1=new ArraySum();
		int b[]= {1,2,3,4,5,6};
		int k=a1.method2(b);

		System.out.println(k); 

	}

}
