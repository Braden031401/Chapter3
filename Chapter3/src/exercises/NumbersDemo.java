package exercises;

public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int num1 = 5;
	int num2= 10;
	
	displayTwiceTheNumber(num1, num2);
	
	displayNumberPlusFive(num1, num2);
	
	displayNumberSquared(num1, num2);
	}
	public static void displayTwiceTheNumber(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
firstNumber = x * 2;
secondNumber = y * 2;
		

	System.out.println("Number 1 times 2 is "+ firstNumber);
	System.out.println("Number 2 times 2 is "+ secondNumber);
	
	}
	public static void displayNumberPlusFive(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x + 5;
		secondNumber = y + 5;
		
		System.out.println("Number 1 plus 5 is "+ firstNumber);
		System.out.println("Number 2 plus 5 is "+ secondNumber);
	}
	public static void displayNumberSquared(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		int square1;
		int square2;
		
		firstNumber = x;
		secondNumber = y;
		
		square1 = firstNumber * firstNumber;
		square2 = secondNumber * secondNumber;
	
		
		System.out.println("Number 1 squared is "+ square1);
		System.out.println("Number 2 squared is "+ square2);
		
	}
	
}
	

