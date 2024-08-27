package com.gentech.returnmethod;
class Array2
{
	short[] method3(short a[])
	{
		short res[]= new short[a.length];
		for(int i=a.length/2; i<a.length; i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		Array2 obj=new Array2();
		short b[]= {20,40,60,80,100,120};
		short c[]=obj.method3(b);
		for(int i=c.length/2; i<c.length; i++)
		{
			System.out.print(c[i] + " ");
		}

	}

}
