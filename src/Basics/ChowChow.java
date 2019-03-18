package Basics;

public class ChowChow
{
	int puppyAge;
	
	public ChowChow(String name)
	{
		//This constructor has one parameter, name)
		System.out.println("Name chosen is: " + name);
	}
	
	public void setAge( int age)
	{
		puppyAge = age;
	}
	
	public int getAge()
	{
		System.out.println("Puppy's age is: " + puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args) 
	{
		//Object creation, if the class name and method name is name, you can
		//pass the arguments directly from the object creation to constructor method
		ChowChow myChowChow = new ChowChow("Fluffy");
		
		//call class method to set ChowChow's age
		myChowChow.setAge(2);
		
		//call another class method to get ChowChow's age
		myChowChow.getAge();
		
		//You can access instance variable as follows as well
		System.out.println("Variable value: " + myChowChow.puppyAge);
	}
/*********** NOTE *************/

// 1. Main Method cannot have empty declared global variables and if you want to 
// to use global variable still you have to declare it as static.
	
// 2. If you are having method name as same as class name you can directly pass the
// arguments to the constructor method.
	
	
}
