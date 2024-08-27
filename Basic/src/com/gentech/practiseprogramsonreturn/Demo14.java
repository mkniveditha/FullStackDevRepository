package com.gentech.practiseprogramsonreturn;
class Array1
{
	int[] display(int a[][])
	{
		int arr[]=new int[a.length];
		int k=0;
		for(int i=0; i<1; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				arr[k]=a[i][j];
				k++;
			}
		}
		return arr;
	}
}
public class Demo14 {

	public static void main(String[] args) {
		Array1 a= new Array1();
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[]=a.display(b);
		for( int val:c)
		{
			System.out.print(val + " ");
		}
			

	}

}
