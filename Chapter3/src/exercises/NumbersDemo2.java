package exercises;

import java.util.Scanner;

public class NumbersDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int num1;
	int num2;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please Specify Number 1 >>> ");
	num1 = input.nextInt();
	
	System.out.print("Please Specify Number 2 >>> ");
	num2 = input.nextInt();
	
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
		

	System.out.println(x +" times 2 is "+ firstNumber);
	System.out.println(y +" times 2 is "+ secondNumber);
	
	}
	public static void displayNumberPlusFive(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x + 5;
		secondNumber = y + 5;
		
		System.out.println(x +" plus 5 is "+ firstNumber);
		System.out.println(y +" plus 5 is "+ secondNumber);
	}
	public static void displayNumberSquared(int x, int y)
	{
//		int firstNumber;
//		int secondNumber;
//		int square1;
//		int square2;
//		
//		firstNumber = x;
//		secondNumber = y;
//		
//		square1 = firstNumber * firstNumber;
//		square2 = secondNumber * secondNumber;
//	
//		
//		System.out.println(x +" squared is "+ square1);
//		System.out.println(y +" squared is "+ square2);
		
		int square = (int) Math.pow(x, 2);
		int square1 = (int) Math.pow(y, 2);
		System.out.println(x +" squared is "+ square);
		System.out.println(y +" squared is "+ square1);
	}
	
}
	

