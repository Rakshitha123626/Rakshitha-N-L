package Program;
import java.util.Scanner;
public class OrderingPizzaBasedonSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int amount=0;
    System.out.println("ENter the size of pizza");
    String size=sc.nextLine();
    switch(size)
    {
    case "small":
    		
    	
     System.out.println(amount=125);
     break;
    
    case "medium":
    	
    	System.out.println(amount=250);
    	 break;
    	 
    case "large":
    	
    	System.out.println(amount=300);
    	break;
    	
    case "very large":
    	
    	System.out.println(amount=350);
    	break;
    	default:
    		 System.out.println("wrong size");
    }
    
	}

}

