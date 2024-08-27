package com.gentech.methods;
class IsPrime
{
	void method(int j, int k)
	{
		
		for (int i=50; i<=k; i++)
		{
			int count=0;
			for(int m=2; m<i; m++)
			{
				if(i%m==0)
				{
					count++;
					break;
				}
			}
				if(count==0)
					System.out.println(i);
			}
		}
	}




public class Assignment11 {

	public static void main(String[] args) {
		IsPrime obj=new IsPrime();
		obj.method(1,50);

	}

}
