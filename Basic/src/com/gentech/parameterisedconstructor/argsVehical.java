package com.gentech.parameterisedconstructor;


class Twowheeler
{
	  String TwName;
	  int Twid;
	  Twowheeler(String Tname, int Tid)
	  {
		  
			TwName=Tname;
			Twid=Tid;
			System.out.println("TwName: "+TwName);
			System.out.println("Twid: "+ Twid);
			System.out.println("+++++++++");
	  } 	  
}

class Fourwheeler
{
	 String FwName;
	 int Fwid;
	 
	 Fourwheeler(String FName, int Fid )
	 {
		 
		 FwName=FName;
		 Fwid=Fid;
		 System.out.println("Fwname: "+FwName);
		 System.out.println("Fwid: "+Fwid);
		 System.out.println("+++++++++");
	 }
}

class Heavyvehicals
{
	 String HwName;
	 int Hwid;
	 
	 Heavyvehicals(String HName, int Hid )
	 {
		 HwName=HName;
		 Hwid=Hid;
		 System.out.println("Hwname: "+ HwName);
		 System.out.println("Hwid: "+ Hwid);
	 }
}


public class argsVehical {

	public static void main(String[] args) {
		Twowheeler o1=new Twowheeler("Bike", 10);
		Fourwheeler o2=new Fourwheeler("car", 15);
		Heavyvehicals o3=new Heavyvehicals("Truck", 20);


	}

}
