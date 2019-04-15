package composite;

import java.util.ArrayList;

public class ConcreteBurger implements Burger extends Composite{

    private ArrayList<String> options = new ArrayList<>();
    private double price;
    Burger newBurger;


    public ConcreteBurger(String d) {
        super(d);
        super(newBurger);
    }

    @Override
    public double setOptions(ArrayList<String> options) {
        this.options = options;

            //protein weight proportion price
            if (options.get(0).indexOf("1/3lb.") != -1) {
                this.price += 9.50;
            }
            if (options.get(0).indexOf("2/3lb.") != -1) {
                this.price += 11.50;
            }
            if (options.get(0).indexOf("1lb.") != -1) {
                this.price += 15.50;
            }
            //bowl costs additional $1.00
            if (options.get(0).indexOf("In A Bowl") != -1) {
                this.price += 1.00;
            }

        return this.price;
    }
}
