package composite;

import java.util.ArrayList;

public class Toppings extends BurgerDecorator {

    public Toppings(Burger newBurger) {
        super(newBurger);
    }

    public double setOptions(ArrayList<String> options) {
        this.options = options;

        //topping choices
        String[] toppingOptions = {"Bermuda Red Onion", "Dried Cranberries", "Lettuce Blend", "Scallions", "Black Olives",
                "Grilled Onions", "Organic Mixed Greens", "Sliced Cucumbers", "Carrot Strings", "Grilled Pineapple", "Roasted Green Chilies",
                "Spicy Pepperoncinis", "Coleslaw", "Hard Boiled Eggs", "Roasted Corn & Black Bean Salsa", "Sprouts", "Dill Pickle Chips",
        "Jalapenos", "Roasted Red Peppers", "Tomatoes"};

        int numOfToppings = 0;
        for(int i = 0; i < toppingOptions.length; i++) {
            if(options.contains(toppingOptions[i])) {
                numOfToppings++;
            }
        }
        //first four toppings free, additional $.75 each
        if(numOfToppings > 4) {
            this.price += ((numOfToppings-4) * .75);
        }

        //return computed topping(s) price to the entire burger
        return newBurger.setOptions(options) + this.price;
    }
}