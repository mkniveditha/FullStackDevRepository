package com.gentech.inheritance;
class Customer
{
	void name()
	{
		System.out.println("Customer Name is Niveditha");
	}
}
class Order extends Customer
{
	void product()
	{
		System.out.println("The ordered product is Vivo mobile");
	}
}
class Price extends Order
{
	void price()
	{
		System.out.println("The ordered price is 250000");
	}
}
class Reviews extends Price
{
	void rating()
	{
		System.out.println("The rating is five star");
	}
}

public class Singlelevel {

	public static void main(String[] args) {
		Reviews r=new Reviews();
        r.name();
        r.product();
        r.price();
        r.rating();

	}

}
