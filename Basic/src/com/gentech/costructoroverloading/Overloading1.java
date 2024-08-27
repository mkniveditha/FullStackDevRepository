package com.gentech.costructoroverloading;
class Contract
{
	Contract(int id)
	{
		System.out.println("Contract ID:" + id);
	}

	Contract(String name)
	{
		System.out.println("Person name:" + name);
	}

	Contract(byte duration)
	{
		System.out.println("Contract Duration interms of years:" + duration);
	}

	Contract(long dealcost)
	{
		System.out.println("Cost of the Deal:" + dealcost);
	}
}

public class Overloading1 {

	public static void main(String[] args) {
		Contract c1 = new Contract(10);
		Contract c2 = new Contract("Ramesh");
		Contract c3 = new Contract(2);
		Contract c4 = new Contract(200000);
	}

}
