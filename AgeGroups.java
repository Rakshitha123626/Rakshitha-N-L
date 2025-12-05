package Com.acharya.Classes;
import java.util.Scanner;

public class AgeGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Age;
		System.out.println("Enter the age ");
		Age = sc.nextInt();
		if(Age >=0 && Age<= 12)
			System.out.println(Age + "This is a kid age");
		else if(Age >=13 && Age<= 19)
			System.out.println(Age + "This is a Teenage");
		else if(Age >=20 && Age<= 40)
			System.out.println(Age + "This is a Younager");
		else if(Age >=40 && Age<= 55)
			System.out.println(Age + "This is a aged man");
		else if(Age >=55 && Age<= 70)
			System.out.println(Age + "This is a old man");
		else
			System.out.println(" Age is Too older");
			
		

	}

}
