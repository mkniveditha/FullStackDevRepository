package com.gentech.practiseprogramsonreturn;
class Gube
{
	void diagonal(int a[][])
	{
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i][i]);
			
		}
		
	}
}

public class Demo11 {

	public static void main(String[] args) {
		Gube g= new Gube();
		int k[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		g.diagonal(k);
		
	}

}
