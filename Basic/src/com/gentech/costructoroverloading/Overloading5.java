package com.gentech.costructoroverloading;
class UserProfile
{
	UserProfile(int Id)
	{
		System.out.println("Profile Id : "+ Id);
	}

	UserProfile(String name)
	{
		System.out.println("User Name : "+ name);
	}

	UserProfile(long password)
	{
		System.out.println("User Password : "+ password);
	}

	UserProfile(double height)
	{
		System.out.println("User Height : "+ height);
	}

	UserProfile(boolean isactive)
	{
		System.out.println("User Is Active : "+ isactive);
	}
}

public class Overloading5 {

	public static void main(String[] args) {
		UserProfile u1=new UserProfile(21);
		UserProfile u2=new UserProfile("Nivi");
		UserProfile u3=new UserProfile(202120);
		UserProfile u4=new UserProfile(4.8);
		UserProfile u5=new UserProfile(true);
	}

}
