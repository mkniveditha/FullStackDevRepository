package com.gentech.test;
class Odd
{
	static int[] show()
	{
		int arr[]=new int[6];
		int k=0;
		for(int j=21; j>=11; j--)
		{
			if(j%2==1)
			{
				arr[k]=j;
				k++;
			}
		}
		return arr;
	}
}
	public class Test7 {

		public static void main(String[] args) {
			int c[]=Odd.show();
			for(int i=0; i<c.length; i++)
			{
				System.out.println(c[i] + " ");
			}

		}

	}
