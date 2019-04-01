package composite;

public class Premium extends BurgerDecorator {

    private String[] options;

    public Premium(Burger newBurger) {
        super(newBurger);
    }

    public void setOptions(String[] options) {

        this.options = options;
        //each premium costs $1.50
        if(options.length > 0) {
            this.price += (options.length * 1.50);
        }
        System.out.println(this.price);
    }

}
