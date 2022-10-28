import java.util.*;
class Result
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		char name;
		int std;
		int rollno;
		float subject1,subject2,subject3,subject4,subject5,percentage;
		
		
		
		System.out.println("Enter the name:");
		name= s.next().charAt(0);
		
		System.out.println("Enter the std:");
		std= s.nextInt();
		
		System.out.println("Enter the rollno:");
		rollno= s.nextInt();
		
		System.out.println("Maths:");
		subject1= s.nextFloat();
		System.out.println("English:");
		subject2= s.nextFloat();
		System.out.println("Hindi:");
		subject3= s.nextFloat();
		System.out.println("Computer:");
		subject4= s.nextFloat();
		System.out.println("Science:");
		subject5= s.nextFloat();
		
		//System.out.println("Total percentage is:");
		//percentage= s.nextFloat();
		percentage= ((subject1+subject2+subject3+subject4+subject5)/500)*100;
		
		
		if(percentage>=50)
			System.out.println("You cleared the exam:"+percentage);
		else
			System.out.println("Sorry ,You have failed:"+percentage);
	}	
	
}