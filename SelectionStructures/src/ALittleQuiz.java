import java.util.Scanner;

public class ALittleQuiz
{
	public static void main( String[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
	
	
		int A1,A2,A3;
		
		
	
		
		
		System.out.println("Q1) What is the probability of getting this question right by guessing");
		System.out.println("1) 25%");
		System.out.println("2) 50%");
		System.out.println("3) 25%");
		System.out.println("4) 75%");
		System.out.println("");
		System.out.print(">");
		A1 = keyboard.nextInt();
		
		if ( A1 == 1 )
		{
			System.out.println("Sorry, the correct answer is 50%");
		}
		else if ( A1 == 2 )
		{
			System.out.println("Thats correct!");
		}
		else if ( A1 == 3 )
		{
			System.out.println("Sorry, the correct answer is 50%");
		}
		else if ( A1 == 4 )
		{
			System.out.println("Sorry, the correct answer is 50%");
		}
		
		System.out.println("Q2) What 100 in binary");
		System.out.println("1) 4");
		System.out.println("2) 100");
		System.out.println("3) 3");
		System.out.println("4) 8");
		System.out.println("");
		System.out.print(">");
		A2 = keyboard.nextInt();
		
		if ( A2 == 1 )
		{
			System.out.println("Correct!");
		}
		else if ( A2 == 2 )
		{
			System.out.println("Sorry, the correct answer is 4");
		}
		else if ( A2 == 3 )
		{
			System.out.println("Sorry, the correct answer is 4");
		}
		else if ( A2 == 4 )
		{
			System.out.println("Sorry, the correct answer is 4");
		}
		
		
		System.out.println("Q3) What color is #ffff00 in hes code");
		System.out.println("1) Yellow");
		System.out.println("2) Blue");
		System.out.println("3) Red");
		System.out.println("");
		System.out.print(">");
		A3 = keyboard.nextInt();
		
		if ( A2 == 1 )
		{
			System.out.println("Thats correct");
		}
		else if ( A2 == 2 )
		{
			System.out.println("Sorry, the correct answer is Yellow");
		}
		else if ( A2 == 3 )
		{	
			System.out.println("Sorry, the correct answer is Yellow");
		}
		
		
		if (A1==2)
		{
			A1=1;
		}
		else
		{
			A1=0;
		}
		
		if (A2==1)
		{
			A2=1;
		}
		else
		{
			A2=0;
		
		}
		if (A3==1)
		{
			A3=1;
		}
		else
		{
			A3=0;
		}
		
		System.out.println("Congrats your score is " + (A1 + A2 + A3) + " out of 3");
		
	
		
		
		keyboard.close();
	
		
		
		
	}
}