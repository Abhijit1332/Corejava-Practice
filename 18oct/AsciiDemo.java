//import package
import java.util.Scanner;
//declaring a class
class AsciiDemo
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
		
		
	}
}