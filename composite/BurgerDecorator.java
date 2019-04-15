package composite;

import java.util.ArrayList;

abstract class BurgerDecorator implements Burger {

    protected Burger newBurger;
    protected double price;
    protected ArrayList<String> options;

    public BurgerDecorator(Burger newBurger) {
        this.newBurger = newBurger;
    }

    public double setOptions(String[] options) {
        this.options = options;
        return newBurger.setOptions(options);
    }

}
