package Com.acharya.Classes;

public class SumOfTwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{12,23,3,14},
				{25,67,45,12},
				{24,15,67,18}};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		
			for(int j=0;j<arr[i].length;j++)

		
				sum+=arr[i][j];
				System.out.println("Sum of the array elements "+ sum);
				}
		
		
		
		
		
		
		}

	


