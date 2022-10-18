//import packages 

import java.util.Scanner;
//declaring a class
class DataDemo1
{
	public static void main(String args[])
	{
	  int num1=93;
	  int d= 9;
	  
	  System.out.println("Quotient :"+num1/d);
	  System.out.println("Remainder :"+num1%d); // modulus operator
	  
	  System.out.println(num1>92);
	  
	 int x=4,y=9;
	 System.out.println("And:"+ (x&y)); //int is converted to the binary
	 System.out.println("OR:"+ (x|y));
	 System.out.println("Not:"+ (~x));
	 System.out.println("XOR:"+ (x^y));
	 
	 boolean status;
	 System.out.println(status= (true&&false));
	 
	System.out.println( (x>=5)||(y>=10));
	
	System.out.println(20<<3);
	// left shift(20 *(2^3)) 
	System.out.println(20>>3);
	// right shift(20/ (2^3))
		
	}
		
} 
