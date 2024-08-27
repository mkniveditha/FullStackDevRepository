package com.gentech.practiseprogramsonreturn;
class IsPrime
{
	int[] method(int a, int b)
	{   
		int count=0;
		int res[]=new int[b];
		for(int i=2; i<=b; i++)
		{
			int x=0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					x=x+1;
					break;
				}

			}


			if(x==0)
			{
				res[count]=i;
				count++;
			}
		}
		int k[]=new int[count];
		for (int i=0;i<count;i++)
		{
			k[i]=res[i];
		}
		return k;
	}
}
public class Demo9 {

	public static void main(String[] args) {
		IsPrime o=new IsPrime();
		int k[]=o.method(1, 50);
		for(int i=0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}
		
	}

}
