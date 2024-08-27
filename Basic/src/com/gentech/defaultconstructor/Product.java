package com.gentech.defaultconstructor;
class Product1
{
	String name;
	int cost;

}
class Sales
{
	String type;
	int id;
}
class Order
{
	String address;
	int id;
}

public class Product {

	public static void main(String[] args) {
		Product1 pro=new Product1();
		pro.name="Slipper";
		pro.cost=1000;
		System.out.println("product name " +pro.name);
		System.out.println("product cost " +pro.cost);
		System.out.println("------------------------");



		Sales sales=new Sales();
		sales.type="online";
		sales.id=11;
		System.out.println("bought in " +sales.type);
		System.out.println("sale id " +sales.id);
		System.out.println("------------------------");


		Order order=new Order();
		order.id=101;
		order.address="Attiguppe";
		System.out.println( "id of order " +order.id);
		System.out.println( "order address " +order.address);
		System.out.println("------------------------");


	}

}
