package com.gentech.returnmethod;
class Diagonal
{
	short[] method10 (short a[][])
	{
		short res[]= new short[a.length];
		for(int i=0; i<a.length; i++)
		{
			res[i]=a[i][i];
		}
		return res;
	}
}
public class Assignment10 {

	public static void main(String[] args) {
		Diagonal d1=new Diagonal();
		short b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		short c[]=d1.method10(b);
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i] + " ");

		}

	}

}
