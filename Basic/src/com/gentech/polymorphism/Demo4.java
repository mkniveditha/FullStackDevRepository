package com.gentech.polymorphism;
abstract class Device
{
	abstract void powerOn();
}

class SmartPhone extends Device
{
	void powerOn()
	{
		System.out.println("SmartPhone power is on");
	}

}

class Tablet extends Device
{
	void powerOn()
	{
		System.out.println("Tablet power is on");
	}

}

class Laptop extends Device
{
	void powerOn()
	{
		System.out.println("Laptop power is on");
	}

}
public class Demo4 {

	public static void main(String[] args) {
		Device device=null;
		
		SmartPhone s=new SmartPhone();
		Tablet t=new Tablet();
		Laptop l=new Laptop();
		
		device=s;
		device.powerOn();

		device=t;
		device.powerOn();
		
		device=l;
		device.powerOn();
	}

}
