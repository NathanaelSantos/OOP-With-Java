package week2.avaliation;

import java.util.HashMap;

public class Pizza {
    static HashMap<String,Integer> ingredientMap  = new HashMap<>();
    static int numberOfIngredients;

    public void addIngredient(String ingredient) {
        if(ingredientMap.containsKey(ingredient))
            ingredientMap.put(ingredient, ingredientMap.getOrDefault(ingredient, 0) + 1);
        else
            ingredientMap.put(ingredient, 1);

        numberOfIngredients++;
    }

    public int getPrice(){
        if(numberOfIngredients <= 2){
            return 15;
        }

        if(numberOfIngredients >= 3 && numberOfIngredients <=5){
            return 20;
        }

        if(numberOfIngredients > 5){
            return 23;
        }

        return 0;
    }

    public static HashMap<String, Integer> getIngredientMap() {
        return ingredientMap;
    }
}
