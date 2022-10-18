//import packages 

import java.util.Scanner;
//declaring class
class CastingDemo
{
	public static void main(String args[])
	{
		//declaring short data type
		short s1= 50;
		short s2= 80;
		
		//calculating the sum
		short sum;
		sum= (short)(s1+s2); 
		
		//printing the sum
		System.out.println("The sum is :"+sum);
		
		//byte
		byte b1= 62;
		byte b2 =60;
		
         byte cal= (byte)(b1+b2);
	     //printing the sum
		System.out.println("The calc is :"+cal);
		
		double d1= 81.5;
		double d2= 76.4;
		float dd= (float)(d1+d2);
		System.out.println("The dd is :"+dd);
		
		// type casting omit
		
		byte b3=7;
		byte b4=5;
		
		
		b3+=b4; 
				
		System.out.println("The b3  :"+b3);
		
		
	}
		
	

}
 
