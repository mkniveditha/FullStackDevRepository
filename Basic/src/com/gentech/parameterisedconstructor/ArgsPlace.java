package com.gentech.parameterisedconstructor;



class Country
{
	 String countryname;
	 int countryid;
	 Country(String cname, int cid )
	 {
			countryname=cname;
			countryid=cid;
			System.out.println("country name: "+countryname);
			System.out.println("country id: "+countryid);
			System.out.println("+++++++++");
		
	 }
}
	 class State
	 {
	 	String statename;
	 	String langauage;
	 	State(String sname, String lang)
	 	{
	 		
			 statename=sname;
			 langauage= lang;
			 System.out.println("state name: "+ statename);
			 System.out.println("langauage: "+ langauage);
			 System.out.println("+++++++++");
	 	}
	 	
	 	
	 }
	 class Distict
	 {
	 	String districtname;
	 	int pincode;
	 	
	 	Distict(String disname, int pin)
	 	{
	 		
			 districtname=disname;
			 pincode=pin;
			 System.out.println("district name: "+  districtname);
			 System.out.println("pincode: "+  pincode);
					 
	 	}
	 }
	 class Village
	 {
	 	String villagename;
	 	String villagedistict;
	 	
	 	Village(String name,  String distict)
	 	{
	 		villagename=name;
		 	villagedistict=distict;
		 	System.out.println("village name:"+ villagename);
		 	System.out.println("village distict"+villagedistict);
	 	}
	 	
	 }


public class ArgsPlace {

	public static void main(String[] args) {
		 Country c1 =new Country("India", 10);
		 State s2=new State("Karnatada", "Kannada" );
		 Distict d3 =new Distict("MAndya", 571401); 
		 Village v4 = new Village(" Gejjalagere", "Mandya");

	}

}
