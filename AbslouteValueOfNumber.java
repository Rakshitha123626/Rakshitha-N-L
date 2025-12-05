package Com.acharya.Classes;
import java.util.Scanner;

public class AbslouteValueOfNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Number;
		System.out.println("Enter the number ");
		Number =sc.nextInt();
		if(Number<0)
			Number=-Number;
		System.out.println("Absloute value of number="+Number);
		
			

	}

}
