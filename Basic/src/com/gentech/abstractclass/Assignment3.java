package com.gentech.abstractclass;
abstract class Dress
{
	abstract void brand();
}
class Girlswear extends Dress
{
	void brand() 
	{
		System.out.println("The famous girlswear brand is Fig");
	}
}


public class Assignment3 {

	public static void main(String[] args) {
		Dress o1=new Girlswear();
		o1.brand();


	}

}
