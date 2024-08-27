package com.gentech.abstractclass;
abstract class Company
{
	static void diplayEmpName()
	{
		System.out.println("The Employee name is Vivek");
	}
	static void displayJobname()
	{
		System.out.println("Employee Job is Manager");
	}
	static void displaySalary()
	{
		System.out.println("Salary of Employee is 45000");
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		
			Company.diplayEmpName();
			Company.displayJobname();
			Company.displaySalary();


	}

}
