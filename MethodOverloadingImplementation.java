package com.acharya.classes;

public class MethodOverloadingImplementation {

	public void display(int num)
	{
	  System.out.println(" The integer value ="+num);

	}
	public void display( char ch)
	{
		System.out.println("Character ="+ch);
	}
	public void display(String str)
	{
		System.out.println(" String ="+str);
	}
	public static void main(String [] args)
	{
		MethodOverloadingImplementation obj= new MethodOverloadingImplementation();
		obj.display(10);
		obj.display('R');
		obj.display("Rakshi");
		
		
	}

}
