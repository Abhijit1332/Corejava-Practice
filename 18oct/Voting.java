//find valid for vote or not
import java.util.*;

//declaring a class
class Voting
{
	public static void main(String []args)
	{
		//declaring variables
		int age, uage;
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter your age:");
		age= s.nextInt();
		
		//condition apply for vote
		if(age>=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			uage=(18-age);
			System.out.println("Sorry you can vote after :"+ uage + " Years");
		}
	
	}
}