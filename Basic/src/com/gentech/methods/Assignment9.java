package com.gentech.methods;
class Table
{
	void method9(int a)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(a + "*" + i + "=" + (a*i));
		}
	}
}
public class Assignment9 {

	public static void main(String[] args) {
		Table t1=new Table();
		t1.method9(5);

	}

}
