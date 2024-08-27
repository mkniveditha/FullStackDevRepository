package com.gentech.assignment1;

class Country
{
	 String countryname;
	 int countryid;
	 Country()
	 {
			countryname="India";
			countryid=01;
			System.out.println("country name: "+countryname);
			System.out.println("country id: "+countryid);
			System.out.println("+++++++++");
		
	 }
}
	 class State
	 {
	 	String statename;
	 	String langauage;
	 	State()
	 	{
	 		
			 statename="Karnataka";
			 langauage= "kannada";
			 System.out.println("state name: "+ statename);
			 System.out.println("langauage: "+ langauage);
			 System.out.println("+++++++++");
	 	}
	 	
	 	
	 }
	 class Distict
	 {
	 	String districtname;
	 	int pincode;
	 	
	 	Distict()
	 	{
	 		
			 districtname="Mandya";
			 pincode=571401;
			 System.out.println("district name: "+  districtname);
			 System.out.println("pincode: "+  pincode);
					 
	 	}
	 }
	 class Village
	 {
	 	String villagename;
	 	String villagedistic;
	 	
	 	Village()
	 	{
	 		villagename="Gejjalagere";
		 	villagedistic="Mandya";
		 	System.out.println("village name:"+ villagename);
		 	System.out.println("village distic"+villagedistic);
	 	}
	 	
	 }


public class Place {

	public static void main(String[] args) {
		 Country c1 =new Country();
		 State s2=new State();
		 Distict d3 =new Distict(); 
		 Village v4 = new Village();
		 


	}

}
