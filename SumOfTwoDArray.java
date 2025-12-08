package Com.acharya.Classes;

import java.util.Scanner;

public class SumOfTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the value of row "+(i+1)+"and column"+(j+1));
		arr[i][j]=sc.nextInt();
	}
}
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
		
	}
}
	

}


