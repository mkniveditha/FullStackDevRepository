package com.gentech.defaultconstructor;
class Country
{
	String name;
	String capital;

}
class State
{
	String name;
	String capital;
}
class Village
{
	String district;
	int pincode;
}

public class Place {

	public static void main(String[] args) {
		Country c1=new  Country();
		c1.name="India";
		c1.capital="Delhi";
		System.out.println("Country name" +c1.name);
		System.out.println("Country capital" +c1.capital);
		System.out.println("------------------------");


		State s1=new State();
		s1.name="Karnataka";
		s1.capital="Bangalore";
		System.out.println("State name" +s1.name);
		System.out.println("State capital" +s1.capital);
		System.out.println("------------------------");

		Village v1=new  Village();
		v1.district="Mandya";
		v1.pincode=571403;
		System.out.println("District name" +v1.district);
		System.out.println("Village name"+v1.pincode   );
		System.out.println("------------------------");



	}

}
