
public class VariablesAndNames 
{
  public static void main( String[] args)
  {
	  //sets the variables to use
	  int cars, drivers, passengers, cars_not_driven, cars_driven;
	  double space_in_a_car, carpool_capacity, average_passengers_per_car;
	  
	  //determines value for each, either a number, or the combination of other variables
	  cars = 100;
	  space_in_a_car = 4.0;
	  drivers = 30;
	  passengers = 90;
	  cars_not_driven  = cars - drivers;
	  cars_driven = drivers;
	  carpool_capacity = cars_driven * space_in_a_car;
	  average_passengers_per_car = passengers / cars_driven;
	  
	  //Does the addition to see the statistics about the cars
	  System.out.println("There are " + cars + " cars available.");
	  System.out.println("There are only " + drivers +" drivers available.");
	  System.out.println("There will be " + cars_not_driven + " empty cars today.");
	  System.out.println("We can transport " + carpool_capacity + " people today.");
	  System.out.println("We have " + passengers + " to carpool today");
	  System.out.println("We need to put about " + average_passengers_per_car + " in each car");
			  
	  System.out.println("  ");
	  System.out.println("Questions");
	  System.out.println("The 0.4 seems to have no effect when removed");
	  System.out.println("The = can be used to designate the role of an onject, such as cars = 30");
	  System.out.println("While the == is designated as the Equal To function");
	  
	  
  
  
  
  } 
}