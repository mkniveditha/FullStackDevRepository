package com.gentech.practiseprogramsonreturn;
class Square
{
	int[] method(int a, int b)
	{
		int arr[]= new int[b];
		int count=0;
		
		for(int i=a; i<=b; i++)
		{
			arr[count]=i*i;
			count++;
			
		}
		return arr;
	}
}
public class Demo13 {

	public static void main(String[] args) {
		Square s=new Square();
		int v[]=s.method(1, 10);
		for (int i=0; i<v.length; i++)
		{
		System.out.println(v[i]);
		}

	}

}
