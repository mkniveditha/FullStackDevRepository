package com.gentech.methods;
class IsPrimeSum
{
	void display(int i, int j)
	{
		int sum=0;
		for (int k=2; k<=j; k++)
		{
			int c=0;
			for(int m=2; m<k; m++)
			{
				if(k%m==0)
				{
					c=c+1;
					break;
				}
			}
				if(c==0)
				sum=sum+k;
			
		}
		System.out.println(sum);
	}
}
public class Assignment13 {

	public static void main(String[] args) {
		IsPrimeSum obj= new IsPrimeSum();
		obj.display(1,100);

	}

}
