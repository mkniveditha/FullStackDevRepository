package com.gentech.returnmethod;
class Square
{
	int[] method6(int a[])
	{
		int res[] = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			res[i]=a[i]*a[i];
		}
		return res;
	}
}
public class Assignment6 {

	public static void main(String[] args) {
		Square s1=new Square();
		int b[]= {1,2,3,4,5,6,7,8,9,10};
		int k[]=s1.method6(b);
		for(int i=0; i<k.length; i++)
		{
			System.out.println(k[i]);
		}

	}

}
