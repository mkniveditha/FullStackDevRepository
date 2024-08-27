package com.gentech.methods;
class Array5
{
	void method5(double a[][])
	{
		double sum=0;
		for(int i=1; i<2; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
	}
}
public class Assignment5 {

	public static void main(String[] args) {
		Array5 o=new Array5();
		double b[][]= {{10,20,30},{40,50,60},{70,80,90}};
		o.method5(b);
	}

}
