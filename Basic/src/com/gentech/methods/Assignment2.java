package com.gentech.methods;
class Array2
{
	void method2(String s[])
	{
		for(int i=s.length/2; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
	}
}
public class Assignment2 {
	
	public static void main(String[] args) {
		Array2 o=new Array2();
		String b[]= {"Nivi", "Poo", "Deepu","Pinku"};
		o.method2(b);
	}

}
