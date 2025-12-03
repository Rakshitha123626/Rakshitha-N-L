package Array;

public class SumOfArrayElements
  {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int [] arr= {12,21,11,43};
		int sum=0;
		System.out.println("array values");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		sum+=arr[i];
	}
	System.out.println("sum of value="+sum);
	
