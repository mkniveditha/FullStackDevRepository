package com.gentech.test;
class Laptop
{
	
	static String display()
	{
		String name="HP";
		return name;
	}
}
public class Test2 {

	public static void main(String[] args) {
		String c=Laptop.display();
		System.out.println(c);
	}

}
