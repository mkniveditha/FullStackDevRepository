package com.gentech.methods;
class Array1
{
	void method1(int a[])
	{
		int sum=0;
		for (int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		Array1 o=new Array1();
		int b[]= {1,2,3,4,5};
		o.method1(b);

	}

}
