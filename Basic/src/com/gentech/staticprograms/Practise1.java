package com.gentech.staticprograms;
class Addition 
{
	static int a=20;
	static int b=20;
	static int c;
	
	static
	{
		
	    
		showadd();
		
	}

	static void showadd() {
		{
			c = a+b;
			System.out.println(c);
		}
		
	
	
}
}
public class Practise1 {

	public static void main(String[] args) {
		
		Addition a=new Addition();
	}

}


