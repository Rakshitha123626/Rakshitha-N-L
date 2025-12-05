package Com.acharya.Classes;
import java.util.Scanner;

public class OrOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Number1;
		int Number2;
		System.out.println("Enter Number 1 ");
		Number1 = sc.nextInt();
		System.out.println("Enter Number 2 ");
		Number2 = sc.nextInt();
		if(Number1 == 6 ||Number2 == 6 || Number1 + Number2 ==6 || Number1 -Number2 == 6)
			
		System.out.println("True");
		else
			System.out.println("Flase");
		
		

	}

}
