package Program;
import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  numbers");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		  String large=((a>b)&&(a>c))?"large="+a:(b>c)?"large="+b:"large="+c;
		  System.out.println("large="+large);
		  
		
				
		

	}

}
