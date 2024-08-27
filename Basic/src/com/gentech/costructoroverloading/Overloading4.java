package com.gentech.costructoroverloading;
class Invoice
{
	Invoice(int number)
	{
		System.out.println("  Invoice Number : "+ number);
	}

	Invoice(String name)
	{
		System.out.println(" Customer Name : "+ name);
	}

	Invoice(long phoneno)
	{
		System.out.println("  Phone No : "+ phoneno);
	}

	Invoice(double amount)
	{
		System.out.println(" Amount : "+ amount);
	}

	Invoice(boolean ispaid)
	{
		System.out.println(" Invoice Is Paid : "+ ispaid);
	}
}

public class Overloading4 {

	public static void main(String[] args) {
		Invoice i1=new Invoice(16);
		Invoice i2=new Invoice("Mangala");
		Invoice i3=new Invoice("8217744020");
		Invoice i4=new Invoice(30000);
		Invoice i5=new Invoice(false);
	}

}
