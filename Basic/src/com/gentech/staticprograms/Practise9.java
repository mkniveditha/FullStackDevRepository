package com.gentech.staticprograms;
class Diagonal
{
	 int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	void display()
	{
		
		int res=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)

			{
				res=a[j][i];
				System.out.print(res + " ");
			}
			System.out.println();
		}
		
		
	}
}
public class Practise9 {

	public static void main(String[] args) {
		
		Diagonal d=new Diagonal();
		d.display();
		
		
		
		
		
		
		
		
		
		
	
		

	}

}
