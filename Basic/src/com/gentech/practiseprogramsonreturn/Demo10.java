package com.gentech.practiseprogramsonreturn;
class IsPrimeSum
{
	int method(int a, int b)
	{
		int sum=0;
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
				sum=sum+i;
			}

		}
		return sum ;
	}
}
public class Demo10 {

	public static void main(String[] args) {
		IsPrimeSum o=new IsPrimeSum();
		int v=o.method(1, 10);
		System.out.println(v);
	}

}
