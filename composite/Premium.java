package composite;

import java.util.ArrayList;

public class Premium extends BurgerDecorator {

    public Premium() {
        super(newBurger);
    }

    public double setOptions(String[] options) {

        this.options = options;

        /*
        //premium topping choices
        String[] premiumOptions = {"Applewood Smoked Bacon", "Chili", "Housemade Guacamole", "Avocado", "Fried Egg", "Sauteed Mushrooms",
        "Black Forest Ham", "Fried Onion String", "Sum-Dried Tomatoes"}; */

        //check to see if user requested any premium toppings and keep track of count
        //int numOfPremium = 0
        if (options.length > 0) {
                this.price += (options.length * 1.50);
            }
        }

        //return computed premium(s) price to the entire burger
        return newBurger.setOptions(options) + this.price;
    }
}
