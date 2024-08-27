package com.gentech.staticprograms;
class OneDimension
{
	int[] display(int a[])
	{
		int arr[]=new int[a.length/2];
		int k=0;
		for(int i=0; i<a.length/2; i++)
		{
			arr[k]=a[i];
			k++;
		}
		return arr;
	}
}
public class Practise6 {

	public static void main(String[] args) {
		OneDimension o1=new OneDimension();
		int[] b= {10,20,30,40,50,60};
		int c[]=o1.display(b);
		for( int i=0; i<c.length; i++)
		{
			System.out.print(c[i] + " ");
		}

	}

}
