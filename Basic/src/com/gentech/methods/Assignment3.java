package com.gentech.methods;
class Array3
{
	void method3(boolean a[])
	{
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		Array3 o=new Array3();
		boolean b[]= {true,false,false,false};
		o.method3(b);

	}

}
