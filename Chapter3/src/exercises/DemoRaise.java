package exercises;

import java.util.Scanner;

public class DemoRaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary1;
		double startingWage;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Specify Salary >>> ");
		salary1 = input.nextInt();
		
		System.out.print("Specify Starting Wage >>> ");
		startingWage = input.nextInt();
		
		System.out.println("Demonstrating some raises");
		predictRaise(400.00);
		predictRaise(salary1);
		predictRaise(startingWage);
	}
	public static void predictRaise(double salary)
	{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary: "+ salary +" After raise: "+ newSalary);
		

	}

}
