package week2.avaliation;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTest {

    @Test
    public void getPriceNumberOfIngredients() {
        Pizza pizza2 = new Pizza();
        pizza2.addIngredient("Pepperoni");
        pizza2.addIngredient("Cheese");
        pizza2.addIngredient("Onion");

        assertEquals(pizza2.numberOfIngredients, 3);
    }

    @Test
    public void getPrice() {
        Pizza pizza2 = new Pizza();
        pizza2.addIngredient("Pepperoni");
        pizza2.addIngredient("Cheese");
        pizza2.addIngredient("Onion");

        assertEquals(pizza2.getPrice(), 20);
    }
}