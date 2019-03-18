package Basics;

public class ConstructorPuppyDemo 
{
	
	public static void main(String[] args) 
	{
		//The following statement would create an object called ConstructorPuppyDemo
		//and also creates a reference myPuppy to the object and passes a String argument
		ConstructorPuppyDemo myPuppy = new ConstructorPuppyDemo("tommy");
		myPuppy.puppyRan();   //Calling puppyRan Method instance
	}
	
	public ConstructorPuppyDemo(String hesaru)   //This constructor has one parameter, hesaru.
	{
		System.out.println("Passed hesaru is: " + hesaru);
	}
	
	public void puppyRan()
	{
		System.out.println( "Tommy ran away");
	}

}
