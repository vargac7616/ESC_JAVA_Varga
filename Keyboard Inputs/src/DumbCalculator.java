import java.util.Scanner;

public class DumbCalculator
{
	public static void main( String[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		
	double n1,n2,n3;
	
	System.out.println("Lets find the average of a few numbers...");
	System.out.println(" ");
	
	System.out.print("Whats the first number?");
	 n1=keyboard.nextDouble();
	 
	 System.out.print("Whats the second number?");
	 n2=keyboard.nextDouble();
	 
	 System.out.print("Whats the third number?");
	 n3=keyboard.nextDouble();
	 
	 System.out.print("The average is " + (n1 + n2 + n3 / 3) + " ");
	
	 keyboard.close ();
	}
}
