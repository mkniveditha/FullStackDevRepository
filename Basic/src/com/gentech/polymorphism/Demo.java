package com.gentech.polymorphism;
abstract class Person
{
	abstract void sports();
}

class VolleyBall extends Person
{
	void sports()
	{
		System.out.println("The person playing Volleyball"); 
	}
}

class Cricket extends Person
{
	void sports()
	{
		System.out.println("The person playing Cricket"); 
	}
}

class BasketBall extends Person
{
	void sports()
	{
		System.out.println("The person playing BasketBall"); 
	}
}

public class Demo {

	public static void main(String[] args) {
		Person person=null;
		
		VolleyBall v=new VolleyBall();
		Cricket c=new Cricket();
		BasketBall b=new BasketBall();
		
		person=v;
		person.sports();
		
		person=c;
		person.sports();
		
		person=b;
		person.sports();

	}

}
