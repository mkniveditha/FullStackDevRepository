package com.gentech.inheritance;

class Animall 
{
	int leg;
	String sound;
	Animall(int l, String s)
	{
		leg=l;
		sound=s;
	}
	Animall()
	{
		System.out.println("Gube");
	}
	void display()
	{
		System.out.println(leg);
		System.out.println(sound);
	}
}

class Dogg extends Animall
{
	String gender;
	Dogg(int l, String s, String g)
	{
		super(l,s);
		gender=g;
	}
	Dogg()
	{
		System.out.println("Nivi Dog");
	}
	void display()
	{
		super.display();
		System.out.println(gender);
		
	}
}

class GoldenBreed extends Dogg
{
	String petname;
	GoldenBreed(int l, String s, String g, String p)
	{
		super(l,s,g);
		petname=p;
	}
	GoldenBreed()
	{
		System.out.println("gube2");
	}
	void display()
	{
		super.display();
		System.out.println(petname);
	}
}

public class Practise1 {

	public static void main(String[] args) {
		
        GoldenBreed o2=new GoldenBreed(4, "bow", "female", "hello");
        o2.display();
        
	}

}
