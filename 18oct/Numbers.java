//find positive or negative number
import java.util.*;

//declaring a class
class Numbers
{
	public static void main(String []args)
	{
		//declaring variables
		int num;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		num= s.nextInt();
		
		//condition apply 
		if(num>0)
		{
			System.out.println("The number is positive.");
		}
		else
		{
			System.out.println("The number is negaive.");
		}
	
	}
}