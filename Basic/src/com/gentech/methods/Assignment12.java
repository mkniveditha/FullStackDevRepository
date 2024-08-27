package com.gentech.methods;
class IsPrimeCount
{
	void method(int i, int j)
	{
		int count=0; 
		for(int k=50; k<=j; k++)
		{
		
			int c=0;
			for(int m=2; m<k; m++) 
			{
				if(k%m==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
				count=count+1;

			}
		System.out.println(count);

		}
	}
	public class Assignment12 {

		public static void main(String[] args) {
			IsPrimeCount obj= new IsPrimeCount();
			obj.method(50,150);

		}

	}
