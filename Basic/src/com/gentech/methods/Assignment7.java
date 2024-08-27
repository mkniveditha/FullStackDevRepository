package com.gentech.methods;
class Array7
{
	void methods(int a)
	{
		String str=Integer.toString(a);
		int b=str.length();
		System.out.println(b);
	}
	
}
public class Assignment7 {

	public static void main(String[] args) {
		Array7 o=new Array7();
		o.methods(12345);

	}

}
