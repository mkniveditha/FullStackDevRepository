package com.gentech.practiseprogramsonreturn;
class Cube
{
	int[] method(int a, int b)
	{
		int res[]=new int[10];
		int k=0;
		for(int i=1; i<=10; i++)
		{
			res[k]=i*i*i;
			k++;
		}
		return res;
	}
}
public class Demo2 {

	public static void main(String[] args) 
	{
		Cube c=new Cube();
		int b[]=c.method(1,10);
		for(int i=0;i<b.length; i++)
		{
			System.out.println(b[i]);
		}

	}

}
