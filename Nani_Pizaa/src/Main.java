import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("-------------------------------Welcome to Nani Pizaa--------------------------");
		System.out.println("Which Pizza : (1.Veg Pizza  2.Non-Veg Pizza 3.Delux Veg Pizza) 4.Delux Non_Veg Pizza");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			Pizza vegPizza = new Pizza(true);
			vegPizza.addExtraCheese();
			vegPizza.addExtraToppings();
			vegPizza.takeAway();
			vegPizza.getBill();
			break;
			
		case 2:
			Pizza nonvegPizza = new Pizza(false);
			nonvegPizza.addExtraCheese();
			nonvegPizza.addExtraToppings();
			nonvegPizza.takeAway();
			nonvegPizza.getBill();			
			break;
			
		case 3:
			Delux_Pizza deluxvegPizza = new Delux_Pizza(true);
			deluxvegPizza.takeAway();
			deluxvegPizza.getBill();
			break;
			
		case 4:
			Delux_Pizza deluxnonvegPizza = new Delux_Pizza(false);
			deluxnonvegPizza.takeAway();
			deluxnonvegPizza.getBill();
			break;
		default:
			System.out.println("Sorry Enter again !!!");
			return;
		}
		sc.close();
	}
}
