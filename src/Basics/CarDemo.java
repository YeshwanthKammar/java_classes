package Basics;   //Class, Global Variables, Main method, Local Variables,  
                  //Creating an object, Printing local variables, Calling method instance,
                  //Method definition, Printing global variables
public class CarDemo 
{
	//Declaring and defining instance variables globally
	int Tyres = 4;
	String Engine = "Diesel Engine";
	int Mirrors = 2;

	//Main method
	public static void main(String[] args) 
	{
			int Windows;   //Declaring local variable
			Windows = 4;   //Defining local variable inside the main method locally
			int Seats;   //Declaring local variable
			Seats = 5;   //Defining local variable inside the main method locally
			CarDemo m = new CarDemo();   //Creating object using new operator
			System.out.println("Number of windows: " + Windows);   //Printing the local variable
			System.out.println("Number of seats: " + Seats);   //Printing the local variable
			m.carStart();   //Calling carStart Method instance
			m.carMove();   //Calling carMove Method instance
			m.carStop();   //Calling carStop Method instance
			System.out.println("End program");
	}

	//carStart Method definition which returns nothing
	public void carStart()
	{
			System.out.println("Engine type: " + Engine);   //Printing the global variable
			System.out.println("car is started");
	}

	//carMove Method definition which returns nothing
	public void carMove()
	{
			System.out.println("Number of tyres: " + Tyres);   //Printing the global variable
			System.out.println("Car is moving"); 
	}

	//carStop Method definition which returns nothing
	public void carStop()
	{
		System.out.println("Number of mirrors: " + Mirrors);   //Printing the global variable
		System.out.println("Car is stopped"); 
	}
	
}

