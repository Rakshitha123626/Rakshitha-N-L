package Com.acharya.Classes;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int Number = sc.nextInt();
		int sum=0;
		int digit;
		while(Number!=0)
		{
	     digit = Number % 10;
		 sum = sum +digit;
		Number = Number/10;}
		System.out.println("sum of the digit is "+ sum);
	}
}






