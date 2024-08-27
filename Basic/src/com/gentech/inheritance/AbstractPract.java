package com.gentech.inheritance;
abstract class Maths
{
	abstract int[] even(int a,int b);
}
class Dabba extends Maths
{
	int[] even(int a,int b)
	{   
	int k[]=new int[5];
	int j=0;
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				k[j]=i;
				j++;
			}
		}
		return k;
	}
}

public class AbstractPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dabba d=new Dabba();
		int jjjj[]=d.even(1,10);
		for (int i=0;i<jjjj.length;i++)
		{
			System.out.println(jjjj[i]);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++");
		Maths m=new Dabba();
		 int p[]=m.even(5,15);
		 for (int i=0;i<p.length;i++)
			{
				System.out.println(p[i]);
			}
	}

}
