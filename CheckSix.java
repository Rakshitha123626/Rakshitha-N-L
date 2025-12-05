package Com.acharya.Classes;
import java.util.Scanner;


public class CheckSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Check size condition
        if (n < 1) {
            System.out.println("Invalid array size! Size must be 1 or more.");
            return;  // stop program
        }

        int[] arr = new int[n];

        // Take array elements
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if first or last element is 6
        if (arr[0] == 6 || arr[n - 1] == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
