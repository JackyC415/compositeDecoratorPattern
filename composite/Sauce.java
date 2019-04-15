package composite;

import java.util.ArrayList;

public class Sauce extends BurgerDecorator {

    public Sauce(Burger newBurger) {
        super(newBurger);
    }

    public double setOptions(ArrayList<String> options) {
        this.options = options;

        //sauce choices
        String[] sauceOptions = {"Apricot Sauce", "Dijon Balsamic Dressing", "Mayonnaise", "Spicy Sour Cream", "Basil Pesto", "Ginger Soy Glaze",
                "Peanut Sauce", "Steak Sauce", "Chipotle Pesto", "Honey Mustard", "Red Relish", "Sun-Dried Tomato Vinaigrette", "Classic Caesar", "" +
                "Horseradish Mayo", "Roasted Garlic Aioli", "Sweet BBQ Sauce", "Country Buttermilk Ranch", "Hot Wing Sauce", "Russian Dressing", "Tzatziki Sauce"};

        //check to see if user requested any sauces and keep track of count
        int numOfSauce = 0;
        for(int i = 0; i < sauceOptions.length; i++) {
            if(options.contains(sauceOptions[i])) {
                numOfSauce++;
            }
        }

        //first sauce free, additional $.75 each
        if(numOfSauce > 1) {
            this.price += ((numOfSauce-1) * .75);
        }

        //return computed sauce(s) price to the entire burger
        return newBurger.setOptions(options) + this.price;
    }

}