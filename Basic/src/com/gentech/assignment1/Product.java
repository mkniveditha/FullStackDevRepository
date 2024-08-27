package com.gentech.assignment1;

class Product1
{
	String productname;
	int productid;
	Product1()
	{
		productname="Vivo";
		productid=11;
		System.out.println("product name: "+productname);
		System.out.println("product id"+ productid);
		System.out.println("------------");

	}

}
class Sales
{
	int salesid;
	String salesperson;
	Sales()
	{

		salesid=50;
		salesperson="Pinku";
		System.out.println("sales id: "+salesid);
		System.out.println("sales person"+salesperson);
		System.out.println("-------------------");
	}

}

class Order
{
	int orderid;
	String place;
	Order()
	{
		orderid=34627;
		place="Attiguppe";
		System.out.println("order id: "+orderid);
		System.out.println("place "+place);
		System.out.println("---------------------");

	}
}

class Inventery
{
	int rating;
	int percentagesales;

	Inventery()
	{

		rating =5;
		percentagesales =99;
		System.out.println("rating: "+ rating);
		System.out.println("percentage sales"+ percentagesales);
		System.out.println("------------------"); 
	}
}


public class Product {

	public static void main(String[] args) {

		Product1 pod=new Product1();
		Sales sal=new  Sales();
		Order ord= new Order();
		Inventery inv=new Inventery();


	}

}
