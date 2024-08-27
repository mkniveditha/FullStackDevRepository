package com.gentech.practiseprogramsonreturn;
class Table
{
	String[] method(int a)
	{
		String b[]=new String[10];
		int k=0;
		for( int i=1; i<=10; i++)
		{
			String str=a + "*" + i + "=" + (a*i);
			b[k]=str;
			k++;
		}
		return b;
	}
}
public class Demo7 {

	public static void main(String[] args) {
		Table t=new  Table();
		String[] c=t.method(5);
		for (int i=0; i<c.length; i++)
		{
		System.out.println(c[i] + " ");
		}
	}

}
