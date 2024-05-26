package week2.avaliation;

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Pizza pizza1 = new Pizza();
        pizza1.addIngredient("Cheese");
        pizza1.addIngredient("Tomato");
        shoppingCart.addPizzaToCart(pizza1);

        Pizza pizza2 = new Pizza();
        pizza2.addIngredient("Pepperoni");
        pizza2.addIngredient("Cheese");
        pizza2.addIngredient("Onion");
        shoppingCart.addPizzaToCart(pizza2);

        Pizza pizza3 = new Pizza();
        pizza3.addIngredient("Cheese");
        pizza3.addIngredient("Cheese");
        pizza3.addIngredient("Corn");
        pizza3.addIngredient("Tomato");
        shoppingCart.addPizzaToCart(pizza3);

        Pizza pizza4 = new Pizza();
        pizza1.addIngredient("Tomato");
        pizza1.addIngredient("Cheese");
        shoppingCart.addPizzaToCart(pizza4);


        System.out.println("Price R$ " + new Pizza().getPrice());
        System.out.println("Total shopping cart: " + shoppingCart.getTotalCart());
        System.out.println("Quantity used of each ingredient: " + Pizza.getIngredientMap());

    }
}
