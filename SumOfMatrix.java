package Com.acharya.Classes;

import java.util.Scanner;

public class SumOfMatrix {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows ");
        int rows=sc.nextInt();

        System.out.println("Enter the number of columns ");
        int cols=sc.nextInt();

        int MatrixA[][]=new int[rows][cols];
        int MatrixB[][]=new int[rows][cols];
        int sum[][]=new int[rows][cols];

        System.out.println("Enter the first matrix elements ");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                MatrixA[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix elements ");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                MatrixB[i][j]=sc.nextInt();
            }
        }

        System.out.println("Sum of the matrices: ");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                sum[i][j] = MatrixA[i][j] + MatrixB[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
