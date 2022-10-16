//importing util package for Scanner class
import java.util.Scanner;
//declaring a class
class ScannerDemo
{
	//main method
public static void main(String []args)
{
	//creating object of scanner class
	Scanner s = new Scanner(System.in);
	//declaring and initializing local variables
	System.out.println("Enter your name:");
	String name= s.next();
	
	
	System.out.println("Enter your age:");
	int age= s.nextInt();
	
	System.out.println("Enter your marks:");
	float marks= s.nextFloat();
	
	
	System.out.println("Enter Pass/Fail:");
	boolean pass= s.nextBoolean();
	
	System.out.println("Enter your gender (M/F):");
	char gender= s.next().charAt(0);
	
	//Printing the value of all variables
	System.out.println("----------------------------------");
	System.out.println("Your details are:-");
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Marks:"+marks);
	System.out.println("Pass:"+pass);
	System.out.println("Gender:"+gender);
	
}
//end of main 
}
//end of class scann