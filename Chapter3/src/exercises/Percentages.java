package exercises;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 10;
		double num2 = 20;
		
		
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
