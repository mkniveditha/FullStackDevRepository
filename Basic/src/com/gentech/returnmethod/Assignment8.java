package com.gentech.returnmethod;
class Table7
{
	int[] method8(int a[])
	{
		int res[]= new int[a.length];
		for (int i=a.length-1; i>=0; i--)
		{

			res[i]=7*a[i];
		}
		return res;
	}
}
public class Assignment8 {

	public static void main(String[] args) {
		Table7 obj= new Table7();
		int b[]= {1,2,3,4,5,6,7,8,9,10};
		int[] d=obj.method8(b);

		for (int i=d.length-1; i>=0; i--)
		{
			System.out.println(d[i]);

		}

	}

}
