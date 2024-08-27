package com.gentech.parameterisedconstructor;



class Product1
{
  String productname;
  int productid;
  Product1(String name, int id)
  {
		productname=name;
	    productid=id;
	    System.out.println("product name: "+productname);
	    System.out.println("product id"+ productid);
	    System.out.println("------------");
	    
  }
  
}
class Sales
{
	int salesid;
	String salesperson;
	Sales(int id, String person)
	{
		
	    salesid=id;
	    salesperson=person;
	    System.out.println("sales id: "+salesid);
	    System.out.println("sales person"+salesperson);
	    System.out.println("-------------------");
	}
	
}

class Order
{
	int orderid;
	String place;
	Order(int id, String placename)
	{
	    orderid=id;
	    place=placename;
	    System.out.println("order id: "+orderid);
	    System.out.println("place "+place);
	    System.out.println("---------------------");
	
}
}

class Inventery
{
  int rating;
  int percentagesales;
  
  Inventery(int rate, int percentage )
  {
	 
	    rating = rate;
	    percentagesales =percentage;
	    System.out.println("rating: "+ rating);
	    System.out.println("percentage sales"+ percentagesales);
	    System.out.println("------------------"); 
  }
}


public class ArgsProduct {

	public static void main(String[] args) {
		 Product1 pod=new Product1("Vivo", 20);
		 Sales sal=new  Sales( 21, "marketing");
		 Order ord= new Order(25, "Attiguppe");
		 Inventery inv=new Inventery(5, 98);

	}

}
