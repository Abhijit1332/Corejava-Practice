//import packages 

import java.util.Scanner;
//declaring a class
class Grading
{
	//main started
	public static void main(String args[])
	{
		//declaring the object 
		Scanner s = new Scanner(System.in);
		
		//declaring variables
		float percentage;
		char grade;
		
		System.out.println("Enter the percentage:");
		percentage= s.nextFloat();
		
		
		//percentage to cal grade
		if(percentage>=80)
	     	 grade='A';
		 else if(percentage>=70)
			  grade='B';
		      else if(percentage>=50)
				    grade='C';
	                 else if(percentage>=40)
                           grade='D';
                           else
                             grade='F';
			   			
		//end of ifelse	
        if(grade=='F')
	      System.out.println("Sorry!! You have fail... Work hard next time");
	   else
            System.out.println("You have cleared the exam with grade:"+grade);		   
	
	}
		
	// end of main
}
// end of class 
