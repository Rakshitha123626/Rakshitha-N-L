package Com.acharya.Classes;
import java.util.Scanner;

public class Sequence123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter array size: ");
		        int n = sc.nextInt();

		        int[] arr = new int[n];

		        System.out.println("Enter " + n + " elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        boolean found = false;

		        // Loop to check sequence 1, 2, 3
		        for (int i = 0; i < n - 2; i++) {
		            if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3) {
		                found = true;
		                break;
		            }
		        }

		        System.out.println(found);
		    }
		


	}


