package Basics;

public class Employee 
{
	String name;
	int age;
	String designation;
	double salary;
	
	//This is the constructor of the class Employee
	public Employee(String name)
	{
		this.name = name;
	}
	
	//Assign the age of the Employee to the variable age
	public void empAge(int empAge)
	{
		age = empAge;
	}

	//Assign the designation of the Employee to the variable designation
	public void empDesignation(String empDesig)
	{
		designation = empDesig;
	}
	
	//Assign the salary of the Employee to the variable salary
	public void empSalary(double empSalary)
	{
		salary = empSalary;
	}
	
	//Print the Employee details
	public  void printEmployee() 
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Desgnation: " + designation);
		System.out.println("Salary: " + salary);
	}

}
