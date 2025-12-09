package com.acharya.classes;

public class StudentInfo {
	int id;
	String firstname;
	String lastname;
	int fees;
	public StudentInfo(int id,	String firstname,String lastname,int fees)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.fees=fees;
	}
	public void getName()
	{
		System.out.println("Name of the Student is "+firstname +" " +lastname);
	}
	public void geetfees()
	{
		System.out.println("Fee of the student is "+ fees);
	}
	public static void main(String []args)
	{
		StudentInfo s1=new StudentInfo(34,"Rakshitha","NL",50000);
		s1.getName();
		s1.geetfees();
		StudentInfo s2=new StudentInfo(35,"Kavya","SC",45000);
		s2.getName();
		s2.geetfees();
		
		
		
	
				{
			
				}
		
	

	
	

	}

}
