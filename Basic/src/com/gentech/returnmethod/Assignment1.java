package com.gentech.returnmethod;
abstract class Array
{
	abstract int[] method1 (int a[]);

}
class Array1 extends Array
{
	int[] method1 (int a[])
	{
		int res[]=new int[a.length];
		for( int i=0; i<a.length/2; i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		Array1 obj=new Array1();
		int b[]= {10,20,30,40,50,60};
		int c[]=obj.method1(b);
		for(int i=0; i<c.length/2; i++)
		{
			System.out.print(c[i] + " ");
		}


	}

}
