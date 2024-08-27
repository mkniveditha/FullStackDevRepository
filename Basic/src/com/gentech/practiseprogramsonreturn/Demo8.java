package com.gentech.practiseprogramsonreturn;
class Tab
{
	String[] method(int a, int b)
	{
		String ar[]=new String[(b-1)*10];
		 int k=0;
		for(int i=a; i<=b; i++)
		{
			for(int j=1; j<=10; j++)
			{
				String str=i + "*" + j + "=" + (i*j);
				ar[k]=str;
				k++;
			}
			
		}
		return ar;
	}
}
public class Demo8 {

	public static void main(String[] args) {
		Tab t=new Tab();
		String c[]=t.method(2, 20);
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i] + " ");
		}
		System.out.println("------------");
	}

}
