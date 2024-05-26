package week2.avaliation;

import week2.avaliation.Pizza;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Pizza> pizzas = new ArrayList<>();

    public void addPizzaToCart(Pizza pizza){
        if(pizza.getPrice() > 0)
            pizzas.add(pizza);
    }

    public int getTotalCart() {
        return pizzas.size();
    }
}
