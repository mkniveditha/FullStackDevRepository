package com.gentech.methods;
class Array8
{
	void Method8(int a)
	{
	 String str = Integer.toString(a);
	 int sum=0;
	 for(int j=0;j<str.length();j++)
	 {
		char p=str.charAt(j);
		String s=Character.toString(p);
		 sum=sum+Integer.parseInt(s);
	 }
	 System.out.println(sum);
	}

}

public class Assignment8 {

	public static void main(String[] args) {
		Array8 o=new Array8();
		o.Method8(12345);


	}

}
