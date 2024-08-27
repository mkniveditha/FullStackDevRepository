package com.gentech.staticprograms;
class Name
{
	String display()
	{
		String s="Niveditha";
		return s;
	}
	
}
public class Practise11 {

	public static void main(String[] args) {
		Name n=new Name();
		String  val=n.display();
		System.out.println(val);
	}

}
