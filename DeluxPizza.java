package bill;

public class DeluxPizza extends PizzaBase {
    public DeluxPizza(Boolean veg) {
        super(veg);
    }

    @Override
    public void addExtraCheese()
    {
    	this.price+=extraCheesePrice;
    }
    public void addExtraToppings()
    {
    	this.price+=extraToppingsPrice;
    }
}
