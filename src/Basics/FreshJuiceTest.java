package Basics;

class FreshJuice
{
	enum FreshJuiceSize {Small, Medium, Large, MEDIUM}
	FreshJuiceSize size;
}

public class FreshJuiceTest
{
	public static void main(String[] args)
	{
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Size: " + juice.size);
	}
}