package com.gentech.inheritance;
class EnggCollege
{
	String collegename;
	EnggCollege(String clg)
	{
		collegename=clg;
	}
	void show()
	{
		System.out.println("College name is: "+collegename);
	}
}
class President extends EnggCollege
{
	String collegename;
	President(String clg,String presidentname)
	{
		super(clg);
		collegename=presidentname;
	}
	void display()
	{
		System.out.println("President of PESCE is: "+collegename);
	}
}
class  Principal extends President
{
	String collegename;
	String presidentname;
	Principal(String clg,String presiname,String princi)
	{
		super(clg,presiname);
		collegename=princi;
	}
	void display2()
	{
		System.out.println("Principal of PESCE is: "+collegename);
	}
}

public class Assignment8 {

	public static void main(String[] args) {
		Principal o1=new Principal("PESCE","Shri K S Vijayanand","Dr NanjundaSwamy");
		o1.show();
		o1.display();
		o1.display2();


	}

}
