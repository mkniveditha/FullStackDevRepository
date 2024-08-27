package com.gentech.inheritance;
class Animal
{
	void walking()
	{
		System.out.println("The animals walk");
	}
}
class Dog extends Animal
{
	void barking()
	{
		System.out.println("The dog barks");
	}
}
class Charlie extends Dog
{
	void eating()
	{
		System.out.println("The Charlie eat");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		Charlie c= new Charlie();
		c.walking();
		c.barking();
		c.eating();

	}

}
