 package bill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Pizzamania!");

        System.out.println("Available Pizza Variants:");
        System.out.println("1. Veg Pizza");
        System.out.println("2. Non-Veg Pizza");
        System.out.println("3. Delux Veg Pizza");
        System.out.println("4. Delux Non-Veg Pizza");

        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (ch) {
            case 1:
                PizzaBase vegPizza = new PizzaBase(true);
                vegPizza.addExtraToppings();
                vegPizza.addExtraCheese();
                vegPizza.takeAway();
                vegPizza.getBill();
                break;
            case 2:
                PizzaBase nonvegPizza = new PizzaBase(false);
                nonvegPizza.addExtraToppings();
                nonvegPizza.addExtraCheese();
                nonvegPizza.takeAway();
                nonvegPizza.getBill();
                break;
            case 3:
                DeluxPizza veg = new DeluxPizza(true);
                veg.takeAway();
                veg.getBill();
                break;
            case 4:
                DeluxPizza nonveg = new DeluxPizza(false);
                nonveg.takeAway();
                nonveg.getBill();
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}

    