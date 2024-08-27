package com.gentech.practiseprogramsonreturn;
class ArraySum
{
	int method(int a[])
	{
		int sum=0;
		for( int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
			
		}
		return sum;
	}
}
public class Demo6 {

	public static void main(String[] args) {
		ArraySum a=new ArraySum();
		int b[]= {1,2,3,4};
		int c=a.method(b);
		System.out.println(c);
		
		
		

	}

}
