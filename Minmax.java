package Program;
import java.util.Scanner;
public class Minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the 3 numbers");// TODO Auto-generated method stub
		        int n1 = sc.nextInt();
		        int n2 = sc.nextInt();
		        int n3 = sc.nextInt();
		        int largest;
		        if((n1>n2)&&(n1>n3))
		        	largest =n1;
		        	else if(n2>n3)
		        	 largest=n2;
		        	else
		        		largest=n3;
		        System.out.println("largest of three number="+largest);
		        int smallest;
		        if((n1<n2)&&(n1<n3))
		        	smallest=n1;
		        else if(n2<n3)
		        	smallest=n2;
		        else
		        	smallest=n3;
		        System.out.println("smallest="+smallest);
		        		
		        	
		        	
			}

		}

	}


