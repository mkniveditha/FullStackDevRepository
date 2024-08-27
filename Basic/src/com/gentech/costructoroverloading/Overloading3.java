package com.gentech.costructoroverloading;
class SoftwareProduct
{
	SoftwareProduct(String name)
	{
		System.out.println("Product name:" + name);
	}

	SoftwareProduct(float version)
	{
		System.out.println("Software Version:" + version);
	}

	SoftwareProduct(double price)
	{
		System.out.println("Price:" + price);
	}

	SoftwareProduct(int releaseyear)
	{
		System.out.println("Product released year:" + releaseyear);
	}

	SoftwareProduct(boolean isreleased)
	{
		System.out.println("Is software released to market:" + isreleased);
	}
}

public class Overloading3 {

	public static void main(String[] args) {
		SoftwareProduct s1=new SoftwareProduct("MATLAB");
		SoftwareProduct s2=new SoftwareProduct("3.4.55");
		SoftwareProduct s3=new SoftwareProduct(25000);
		SoftwareProduct s4=new SoftwareProduct(2002);
		SoftwareProduct s5=new SoftwareProduct(true);
	}

}
