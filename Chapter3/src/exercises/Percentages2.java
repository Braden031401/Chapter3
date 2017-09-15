package exercises;

import java.util.Scanner;

public class Percentages2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Specify Number 1 >>> ");
		num1 = input.nextInt();
		System.out.print("Please Specify Number 2 >>> ");
		num2 = input.nextInt();
		
		computePercent(num1, num2);
}
public static void computePercent(double x, double y)
{

	double Percent1 = (int) Math.ceil((x/y)*100);
	double Percent2 = (int) Math.ceil((y/x)*100);
	
	
	System.out.println(x +" is "+ Percent1 +"% of "+ y);
	System.out.println(y +" is "+ Percent2 +"% of "+ x);
	}
} 
