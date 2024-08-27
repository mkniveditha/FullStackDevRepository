package com.gentech.practiseprogramsonreturn;
class PrimeCount
{
	int method(int a, int b)
	{
		int count=0;
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
				count=count+1;
			}
		}
		return count;
	}
}
public class Demo12 {

	public static void main(String[] args) {
		PrimeCount p=new PrimeCount();
		int v=p.method(1,10);
		System.out.println(v);

	}

}
