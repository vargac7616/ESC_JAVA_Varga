import java.util.Scanner;
//the first line of code allows an already made systems of variable
public class AskingQuestions 
{
	public static void main( String[] args)
	{ 
		Scanner keyboard = new Scanner(System.in);
		
		
	String name;
	int age, feet, inches;
	double weight;
	
	 System.out.println("What is your name?");
	 name=keyboard.next();
	 
	 System.out.println("how old are you?");
	 age=keyboard.nextInt();
	 
	 System.out.println("how many feet tall are you?");
	 feet=keyboard.nextInt();
	 
	 System.out.println("How many Inches");
	 inches=keyboard.nextInt();
	 
	 System.out.println("How much do you weigh");
	 weight=keyboard.nextDouble();
	 
	 System.out.println("So you're name is " + name + " ,you are " + age + " years old, you're " + feet + "'" + inches + " , and you weight " + weight + " pounds." );
	
	 keyboard.close ();
		
	

	}	
}
