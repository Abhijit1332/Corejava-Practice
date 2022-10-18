//import package
import java.util.Scanner;
//declaring a class
class DataDemo
{
	public static void main(String []arg)
	{
		//creating scanner object
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a character:");
		
		//taking character input
		char charValue= s.next().charAt(0);
		//char to asciiValue
		int asciiValue= charValue;
		
		//print asciivalue
		System.out.println("The Ascii Value of "+charValue+" is:"+asciiValue );
		
		int num1=8;
		num1= num1+1;
		
		//num1++ //post increment
		//++num1 //pre increment
		
		int number1= 88;
		int sum= number1++;
		System.out.println("Value of sum using number1++: "+sum);
		
		int number2= 88;
		sum= ++number2;
		System.out.println("Value of sum using ++number :"+sum);
		
		int i=1;
		System.out.println("Not i :"+ -i);
		
		boolean status= true;
		System.out.println("!Status : " +!status);
		
		
	}
	
}
