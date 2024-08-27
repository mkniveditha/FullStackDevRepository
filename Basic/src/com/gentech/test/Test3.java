package com.gentech.test;
class Circle
{
	 
	
	static double show()
	{
		int r=2;
		double Area=(3.14*r*r);
		return Area;
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		double c=Circle.show();
		System.out.println(c);

	}

}
