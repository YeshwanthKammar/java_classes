package Basics;

public class EmployeeTest 
{

	public static void main(String[] args) 
	{
		//Create two objects using constructor
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Marry Anne");
		
		//Invoking methods for each methods created
		empOne.empAge(26);
		empOne.empDesignation("Senior Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("Software Engineer");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}

}
