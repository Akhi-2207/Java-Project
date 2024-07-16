package bill;

import java.util.Scanner;

public class PizzaBase {
    protected int price;
    private Boolean veg;

    protected int extraCheesePrice = 100;
    protected int extraToppingsPrice = 150;
    protected int backPackPrice = 20;

    protected int basePizzaPrice;

    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isOptedForTakeaway = false;

    Scanner in = new Scanner(System.in);

    public PizzaBase(Boolean veg) {

        this.veg = veg;

        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        System.out.println("Extra cheese(y/n)? => ");
        char ch = in.next().charAt(0);
        switch (ch) {
            case ('y'):
                isExtraCheeseAdded = true;
                this.price += extraCheesePrice;
                break;
            case ('n'):
                isExtraCheeseAdded = false;
                break;
        }
    }

    public void addExtraToppings() {
        System.out.println("Want Extra Topping (y/n) ? =>");
        char ch = in.next().charAt(0);
        switch (ch) {
            case ('y'):
                isExtraToppingsAdded = true;
                this.price += extraToppingsPrice;
                break;
            case ('n'):
                isExtraToppingsAdded = false;
                break;
        }
    }

    public void takeAway() {
        System.out.println("Want TakeAway(y/n)?=>");
        char ch = Character.toLowerCase(in.next().charAt(0));
        switch (ch) {
            case ('y'):
                isOptedForTakeaway = true;
                this.price += backPackPrice;
                break;
            case ('n'):
                isOptedForTakeaway = false;
                break;
        }
    }

    public void getBill() {
        String bill = " ";
        System.out.println("Pizza : " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese : " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings: " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeaway) {
            bill += "take away: " + backPackPrice + "\n";
        }
        bill += "\nTotal Amount: " + this.price + "\n";

        System.out.println(bill);
        System.out.println("\n\n\nThanks you!!!! Visit Again....");
        System.out.println("------------------------------------------------------");
    }
}
    