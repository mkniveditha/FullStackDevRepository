package com.gentech.staticprograms;
class OneDimension1
{
	static int a[]= {1,2,3,4,5,6};
	
	static 
	{
		
		showOneDimension();
	}
	
	static void showOneDimension()
	{
		
		for(int i=a.length/2; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
			
		}
	}
}
public class Practise7 {

	public static void main(String[] args) {
		OneDimension1 obj=new OneDimension1();
		
	}

}
