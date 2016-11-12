import java.util.Scanner;

public class Main 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		printIntroduction();
		int counter=0;
		while(counter==0)
		{
			System.out.println("\n\nChoose what you want to enter");
			System.out.println("For an Individual enter: 1");
			System.out.println("For a Legal Entity enter: 2");
			System.out.println("To exit enter: 3");
			String choice=sc.nextLine();
			switch(choice)
			{
			case "1": getIndividual();
				break;
			case "2": getLegalEntity();
				break;
			case "3": counter++;
				break;
			default: 
				System.out.println("Invalid choice");
				break;
			}
		}
		
	}
	public static void printIntroduction()
	{
		System.out.println("This program will ask you to enter your information and after");
		System.out.println("that, it will tell you if the information is correct or not.");
	}
	
	public static void getIndividual()
	{
		System.out.println("You chose to enter an Individual.");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name.(It has to start with a capital latin letter and contain only latin letters and spacess.");
		System.out.println("It also must be between 3 and 50 characters long.) :");
		String name=sc.nextLine();
		
		System.out.println("Enter your email(It has to statr with a lower case latin letter.):");
		String email=sc.nextLine();
		
		System.out.println("Enter your Facility Key.(it has to look like this : 12-345):");
		String facilityKey=sc.nextLine();
		
		System.out.println("Enter your EGN.(Must contain 10 numbers written together):");
		String EGN=sc.nextLine();
		
		Individual ind=new Individual(name, email, facilityKey, EGN);
	}
	
	public static void getLegalEntity()
	{
		System.out.println("You chose to enter a Legal Entity");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name.(It has to start with a capital latin letter and contain only latin letters and spacess.");
		System.out.println("It also must be between 3 and 50 characters long.) :");
		String name=sc.nextLine();
		
		System.out.println("Enter your email(It has to statr with a lower case latin letter.):");
		String email=sc.nextLine();
		
		System.out.println("Enter your Facility Key.(it has to look like this : 12-345):");
		String facilityKey=sc.nextLine();
		
		System.out.println("Enter your Bulstat.(Must contain 9 numbers written together):");
		String bulstat=sc.nextLine();
		
		LegalEntity le=new LegalEntity(name, email, facilityKey, bulstat);
	}
}
