package com.gentech.costructoroverloading;

import java.util.Date;

class reportGeneration
{
	reportGeneration(int id)
	{
		System.out.println("ID : " + id);
	}

	reportGeneration(String title)
	{
		System.out.println("Report Title: " + title);
	}

	reportGeneration(Date publishedDate)
	{
		System.out.println("Poject Published date:" + publishedDate);
	}

	reportGeneration(byte pageCount)
	{
		System.out.println("No. of pages: " + pageCount);
	}

	reportGeneration(boolean ispublished)
	{
		System.out.println("Is the Project is Published:" + ispublished);
	}
}

public class Overloading2 {

	public static void main(String[] args) {
		reportGeneration r1=new reportGeneration(11);
		reportGeneration r2=new reportGeneration("Library Management System");
		reportGeneration r3=new reportGeneration("2024-07-10");
		reportGeneration r4=new reportGeneration(100);
		reportGeneration r5=new reportGeneration("true");
	}

}
