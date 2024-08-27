package com.gentech.polymorphism;
abstract class Animal
{
	abstract void eat();
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog eats pedigree");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("Cat drink milk");
	}
}

class Cow extends Animal
{
	void eat()
	{
		System.out.println("Cow eats grass");
	}
}

class Rabbit extends Animal
{
	void eat()
	{
		System.out.println("Rabbit eats Carrot");
	}
}

public class Demo5 {

	public static void main(String[] args) {
		Animal animal=null;
		
		Dog d=new Dog();
		Cat c=new Cat();
		Cow c1=new Cow();
		Rabbit r=new Rabbit();
		
		animal=d;
		animal.eat();
		
		animal=c;
		animal.eat();
		
		animal=c1;
		animal.eat();
		
		animal=r;
		animal.eat();

	}

}
