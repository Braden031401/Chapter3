package exercises;
import java.util.Scanner;
public class DelgadosTacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("What do you want to eat?");
	possibleOrders();
	Scanner input = new Scanner(System.in);
		
		
		
		displayMenu();
	
		
}
public static void displayMenu()
{
	double Taco = 1.50;
	double VeggieTaco = 1.50;
	double Quesadilla = 3.00;
	double Burrito = 2.00;
	double AddHotSauce = .50;
	double Water = .50;
	double Soda = 1.50;
	double Chips = 1.00;
	double Churros = 1.00;
	double FruitPie = 2.00;
}
public static void possibleOrders()
{
	Scanner input = new Scanner(System.in);
	
	double Taco = 1.50;
	double VeggieTaco = 1.50;
	double Quesadilla = 3.00;
	double Burrito = 2.00;
	double AddHotSauce = .50;
	double Water = .50;
	double Soda = 1.50;
	double Chips = 1.00;
	double Churros = 1.00;
	double FruitPie = 2.00;
	
	System.out.println("Taco = 1.50");
	Taco = input.nextDouble();
	System.out.println("VeggieTaco = 1.50");
	VeggieTaco = input.nextDouble();
	System.out.println("Quesadilla = 3.00");
	Quesadilla = input.nextDouble();
	System.out.println("Burrito = 2.00");
	Burrito = input.nextDouble();
	System.out.println("AddHotSauce = .50");
	AddHotSauce = input.nextDouble();
	System.out.println("Water = .50");
	Water = input.nextDouble();
	System.out.println("Soda = 1.50");
	Soda = input.nextDouble();
	System.out.println("Chips = 1.00");
	Chips = input.nextDouble();
	System.out.println("Churros = 1.00");
	Churros = input.nextDouble();
	System.out.println("FruitPie = 2.00");
	FruitPie = input.nextDouble();
	}
}

