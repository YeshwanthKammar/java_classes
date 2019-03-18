package Basics;

import java.util.Scanner;

public class TakingInput 
{

	public static void main(String[] args) 
	{
		int a;
		int b;
		int c;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of a: ");
		a = s.nextInt();
		
		System.out.println("Enter the value of b: ");
		b = s.nextInt();
		
		c = a + b;
		
		System.out.println("The addition of " + a + " and " + b + " is " + c);


	}

}
