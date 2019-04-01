package composite;

public class Sauce extends BurgerDecorator {

    private String[] options;

    public Sauce(Burger newBurger) {
        super(newBurger);
    }

    public void setOptions(String[] options) {
        this.options = options;
        //first sauce free, additional $.75 each
        if(options.length > 1) {
            this.price += ((options.length-1) * .75);
        }
        System.out.println(this.price);
    }

}