package com.gentech.staticprograms;
class Fibinocci
{
	void show()
	{
		int fn=0; 
		int sn=1;
		System.out.print(fn + " " + sn + " ");
		for(int i=1; i<=10; i++)
		{
			int tn=fn+sn;
			System.out.print(tn + " ");
			fn=sn;
			sn=tn;
		}
	}
}
public class Practise13 {

	public static void main(String[] args) {
		Fibinocci f=new Fibinocci();
		f.show();
	}

}
