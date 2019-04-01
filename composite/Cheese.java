package composite;

public class Cheese extends BurgerDecorator {

    private String[] options;

    public Cheese(Burger newBurger) {
        super(newBurger);
    }

    public void setOptions(String[] options) {
        this.options = options;
        //first cheese free, additional $1.00 each
        if(options.length > 1) {
            this.price += ((options.length-1) * 1.00);
        }
        System.out.println(this.price);
    }
}
