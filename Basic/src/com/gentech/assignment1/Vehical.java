package com.gentech.assignment1;


class Twowheeler
{
	  String TwName;
	  int Twid;
	  Twowheeler()
	  {
		  
			TwName="KTM";
			Twid=2;
			System.out.println("TwName: "+TwName);
			System.out.println("Twid: "+ Twid);
			System.out.println("+++++++++");
	  } 	  
}

class Fourwheeler
{
	 String FwName;
	 int Fwid;
	 
	 Fourwheeler()
	 {
		 
		 FwName="car";
		 Fwid=11;
		 System.out.println("Fwname: "+FwName);
		 System.out.println("Fwid: "+Fwid);
		 System.out.println("+++++++++");
	 }
}

class Heavyvehicals
{
	 String HwName;
	 int Hwid;
	 
	 Heavyvehicals()
	 {
		 HwName="Lory";
		 Hwid=10;
		 System.out.println("Hwname: "+ HwName);
		 System.out.println("Hwid: "+ Hwid);
	 }
}



public class Vehical {

	public static void main(String[] args) {
		Twowheeler o1=new Twowheeler();
		Fourwheeler o2=new Fourwheeler();
		Heavyvehicals o3=new Heavyvehicals();



	}

}
