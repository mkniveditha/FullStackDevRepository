package com.gentech.methods;
class Cube
{
	void display(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]*a[i]*a[i]);
		}
	}
}
public class Assignment10 {

	public static void main(String[] args) {
		Cube c = new Cube();
		int b[]= {2,4,6};
		c.display(b);

	}

}
