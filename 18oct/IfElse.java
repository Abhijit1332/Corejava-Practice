//importing packages
import java.util.*;

//declaring a class
class IfElse
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter first number:");
		// creating variables
		int num1= s.nextInt();
		System.out.println("Enter second number:");
		// creating variables
		int num2= s.nextInt();
		
		if(num1>num2)
			System.out.println("The greater number is :"+num1);
		else
		   System.out.println("The greater number is :"+num2);	
		
		
	}
		
}
 
