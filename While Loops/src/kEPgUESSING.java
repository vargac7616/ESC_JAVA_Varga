
import java.util.Random;
import java.util.Scanner;

public class kEPgUESSING 
{
	public static void main( String[] args )
	{
	Scanner keyboard = new Scanner(System.in);
	Random r = new Random();
	int number = 1 + r.nextInt(100), guess;
	
	System.out.println("Im thinking of a number 1-100. try to guess it");
	
	
	guess = keyboard.nextInt();
	
	
	while( guess != number)
	{
		System.out.println("Wrong number please try again");
		System.out.print("Your next guess is:");
		guess = keyboard.nextInt();
	}
	
	System.out.println("Congrats Thats it!!");
	
	
	keyboard.close();

	}	

}