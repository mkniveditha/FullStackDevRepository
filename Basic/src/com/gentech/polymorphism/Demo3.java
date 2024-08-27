package com.gentech.polymorphism;
abstract class Shape
{
	abstract void draw();
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Draw a Circle");
	}
}

class Eclipse extends Shape
{
	void draw()
	{
		System.out.println("Draw a Eclipse");
	}
}

class Cube extends Shape
{
	void draw()
	{
		System.out.println("Draw a cube");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		Shape shape=null;
		
		Circle c=new Circle();
		Eclipse e=new Eclipse();
		Cube c1=new Cube();
		
		shape=c;
		shape.draw();
		
		shape=e;
		shape.draw();
		
		shape=c1;
		shape.draw();

	}

}
