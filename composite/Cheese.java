package composite;

import java.util.ArrayList;

public class Cheese extends BurgerDecorator {

    public Cheese(Burger newBurger) {
        super(newBurger);
    }

    public double setOptions(ArrayList<String> options) {
        this.options = options;

        //cheese choices
        String[] cheeseOptions = {"Danish Blue Cheese", "Horseradish Cheddar", "Soft Ripened Brie", "Greek Feta", "Imported Swiss", "Tillamook Cheddar",
                "Gruyere", "Jalapeno Jack", "Yellow American", "Herb Goat Cheese Spread", "Sharp Provolone"};

        //check to see if user requested any premium toppings and add them to counter
        int numOfCheese = 0;
        for(int i = 0; i < cheeseOptions.length; i++) {
            if(options.contains(cheeseOptions[i])) {
                numOfCheese++;
            }
        }

        //first cheese free, additional $1.00 each
        if (numOfCheese > 1) {
            this.price += ((numOfCheese-1) * 1.00);
        }
        //return computed price of cheese options to the entire burger
        return newBurger.setOptions(options) + this.price;
    }
}
