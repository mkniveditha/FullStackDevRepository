package com.gentech.defaultconstructor;
class TwoWheelers
{
	String type;
	int id;

}
class FourWheelers
{
	String type;
	int id;
}
class HeavyVehicles
{
	String type;
	int id;
}

public class Vehical {

	public static void main(String[] args) {
		TwoWheelers two=new TwoWheelers();
		two.type="Bike";
		two.id=8990;
		System.out.println("Example of two wheels vehicles " + two.type);
		System.out.println("id " + two.id);
		System.out.println("------------------------");


		FourWheelers four=new  FourWheelers();
		four.type="car";
		four.id=9891;
		System.out.println("Example of four wheels vehicles " + four.type);
		System.out.println("id " + four.id);
		System.out.println("------------------------");


		HeavyVehicles heavy=new HeavyVehicles();
		heavy.type="truck";
		heavy.id=1011;
		System.out.println("Example of heavy  vehicles " + heavy.type);
		System.out.println("id " + heavy.id);
		System.out.println("------------------------");



	}

}
