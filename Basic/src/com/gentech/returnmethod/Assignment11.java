 package com.gentech.returnmethod;
class Concat
{
	String method11(String a[])
	{
		String s="";
		for (int i=0; i<a.length; i++)
		{
			s=s+a[i]+" ";
		}
		return s;
	}
}
public class Assignment11 {


	public static void main(String[] args) {
		String[] s= {"This","is","niveditha"};
		Concat c1=new Concat();
		String k=c1.method11(s);
		System.out.println(k);
	}

}
