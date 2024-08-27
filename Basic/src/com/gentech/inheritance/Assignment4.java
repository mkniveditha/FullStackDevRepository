package com.gentech.inheritance;
class Dog1
{
	Dog1(String name)
	{
		System.out.println("Dog Name: "+name);
	}
}
class Mammal extends Dog1
{
	int legs;
	Mammal(String name,int legs)
	{
		super(name);
		System.out.println("Mammal with legs is: "+legs);
	}
}
class Breed extends Mammal
{
	Breed(String name,int legs,String breed)
	{
		super(name,legs);
		System.out.println("Dog breed is: "+breed);
	}
}


public class Assignment4 {

	public static void main(String[] args) {
		Breed o1=new Breed("Buddy",4,"Golden Retriever");

	}

}
