package composite;

public class Toppings extends BurgerDecorator {

    private String[] options;

    public Toppings(Burger newBurger) {
        super(newBurger);
    }

    public void setOptions(String[] options) {
        this.options = options;
        //first four toppings free, additional $.75 each
        if(options.length > 4) {
            this.price += ((options.length-4) * .75);
        }
        System.out.println(this.price);
    }

}
