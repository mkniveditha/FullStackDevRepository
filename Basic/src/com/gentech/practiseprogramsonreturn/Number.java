package com.gentech.practiseprogramsonreturn;
class Even
{
	int[] method(int a, int b)
	{
		int res[]=new int[5];
		int k=0;
		for(int i=1; i<=10; i++)
		{
			if(i%2==0) 
			{
				res[k]=i;
				k++;
			}
			
	    }
		return res;
    }
}
public class Number {

	public static void main(String[] args) {
		Even obj=new Even();
		int b[]=obj.method(1,20);
	    for (int i=0; i<b.length; i++)
	    {
	    	System.out.println(b[i]);
	    }
		

	}

}
