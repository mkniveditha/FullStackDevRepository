package com.gentech.practiseprogramsonreturn;
class Array
{
	int[] method(int a[])
	{
		int res[]=new int[a.length];
		for(int i=a.length/2; i<a.length; i++)
		{
			res[i]=a[i];
		}
		return res;	
	}
}
public class Demo5 {

	public static void main(String[] args) {
		Array a= new Array();
		int b[]= {1,2,3,4,5,6};
		for(int i=b.length/2; i<b.length; i++)
		{
			System.out.print(b[i] + " ");
		}
	}

}
