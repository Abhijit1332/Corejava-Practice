//program for Neatedif
import java.util.*;

//declaring a class
class NestedIf
{
	public static void main(String []args)
	{
		//declaring the object of scanner
		Scanner s= new Scanner(System.in);
		
		//declaring variables
		int age;
		float weight;
		
		System.out.println("Enter your age: ");
		age= s.nextInt();
		
		//condition apply 
		if(age>=18)
		{
			System.out.println("Enter your weight: ");
			weight= s.nextFloat();
			
			if(weight>50)
			{
			System.out.println("You can donate blood.");
			}
		
		    else
			
		    {
			System.out.println("you donot donate blood.");
		    }
		}
        else
		{
			System.out.println("you are too young to donate blood");
		}			
	
	}
}