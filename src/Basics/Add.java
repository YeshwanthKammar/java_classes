package Basics;

public class Add 
{
	int a;
	int b;
	public static void main(String[] args) 
	{
		//Creating object using new operator and the reference for the object is c
		Add c = new Add(); 
		c.addTwoNumbers(5, 4);  //Calling addTwoNumbers Method instance and passing the parameters 5 and 4
	}

	//addTwoNumbers Method definition which accepts 2 parameters e and f
	public void addTwoNumbers(int e, int f)
	{
		int d = e + f;
		System.out.println("The addition of " + e + " and " + f + " is " + d);
	}
}
