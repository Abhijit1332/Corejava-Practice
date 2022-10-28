//import packages 

import java.util.Scanner;
//declaring a class
class GreatestNumber
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner s= new Scanner(System.in);
		
		//declaring variables
		int num1,num2,num3;
		
		//taking input
		System.out.println("Enter number1:");
		num1= s.nextInt();
		System.out.println("Enter number2:");
		num2= s.nextInt();
		System.out.println("Enter number3:");
		num3= s.nextInt();
		
		//checking greater number
		if((num1>num2)&&(num1>num3))
	     	 System.out.println("The greatest number is :"+num1);
			   
		else if(num2>num3)
			 System.out.println("The greatest number is :"+num2);
		     
			 else
				 System.out.println("The greatest number is :"+num3);
			
				
		    
	}
		
	// end of main
}
// end of class

