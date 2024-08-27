package com.gentech.abstractclass;
abstract class Bank{
	abstract void bankdetails(String customer,int accNo);
	void rules()
	{
		System.out.println("Minimum balance: 1000Rs");
		System.out.println("Loan upto: 25000");
	}
}
class Branch1 extends Bank{
	void bankdetails(String customer, int accNo) {
		super.rules();
		System.out.println("Customer name : "+customer);
		System.out.println("Account no: "+accNo);
	}
}
class Branch2 extends Branch1{
	void display(String custname,int accno)
	{
		super.bankdetails(custname,accno);
	}
}


public class Assignment5 {

	public static void main(String[] args) {
		Branch2 o=new Branch2();
		o.display("Likitha",1818);
		Bank o2= new Branch2();
		o2.bankdetails("Krupa",7878);


	}

}
