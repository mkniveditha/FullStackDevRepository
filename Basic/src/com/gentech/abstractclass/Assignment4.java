package com.gentech.abstractclass;
abstract class Sum
{
	abstract int method2(int a[]);
}
class Demo1
{
	int method2(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}


public class Assignment4 {

	public static void main(String[] args) {
		Demo1 o1=new Demo1();
		int b[]={1,2,3,4,5};
		int c=o1.method2(b);
		System.out.println(c);


	}

}
