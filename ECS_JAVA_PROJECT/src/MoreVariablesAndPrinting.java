
public class MoreVariablesAndPrinting 
{
	public static void main(String[] args)
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		
		myName = "Chase Varga";
		myAge = 35; // a lie
		myHeight = 74; //inches
		myWeight = 160; //lbs
		myEyes = " Hazel";
		myTeeth = " White";
		myHair = " Brown";
		
		System.out.println("Let's talk about" + myName + ".");
		System.out.println("He's " + myHeight + " inches or " + ( myHeight / 0.3937 ) + " centimeters tall");
		System.out.println("He's " + myWeight + " pounds or " + ( myWeight * 0.45359237 ) +  " kilograms heavy.");
		System.out.println("Actually, thats not too heavy");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teeth are usually " + myTeeth + " depending on the coffee");
		
		System.out.println("If I add " + myAge + " , " + myHeight + " , and " + myWeight + " ,I get " + (myAge + myHeight + myWeight) + ".");
		
		
		
	  	
		
		
		
		
		
	}
}
