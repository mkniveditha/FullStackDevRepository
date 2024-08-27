package com.gentech.returnmethod;
class Reverse
{
	double[] method4(double a[])
	{
		double res[]=new double[a.length];
		for (int i=a.length-1; i>=0; i--)
		{
			res[i]=a[i];
		}
		return res;
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		Reverse o1=new Reverse();
		double b[]= {2,4,6,8};
		double c[]=o1.method4(b);
		for(int i=c.length-1; i>=0; i--)
		{
			System.out.print(c[i] + " ");

		}

	}
}
