package com.gentech.staticprograms;
class Pall
{
	 void display(int n)
    {
       int a=0;
       int res=0;
       int temp=0;
       temp=n;
        while (n > 0)
        {
        	
            a =  n % 10;
            res=(res*10)+a;
            n = n / 10;
           
        }
        if (temp == res)
        {
            System.out.println("Palindrome = Yes");
        }
        else
        {
            System.out.println("Palindrome = No");
        }
        
    }
}
public class Palindrome {

	public static void main(String[] args) {
		int n = 123464321;
		Pall p=new Pall();
		p.display(n);
		
		
	}

}
