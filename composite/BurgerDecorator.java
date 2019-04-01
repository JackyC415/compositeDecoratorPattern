package composite;

public class BurgerDecorator implements Burger {

    protected Burger newBurger;
    protected double price;
    private String[] options;

    public BurgerDecorator(Burger newBurger) {
        this.newBurger = newBurger;
    }

    public void setOptions(String[] options) {
        this.options = options;

        //loop through all burger selections & determine cost of each item accordingly
        for(int i = 0; i < options.length; i++) {
            if ("1/31b.".equals(options[i])) {
                this.price += 9.50;
            } else if ("2/3lb".equals(options[i])) {
                this.price += 11.50;
            } else if ("1lb".equals(options[i])) {
                this.price += 15.50;
            } else if ("In A Bowl".equals(options[i])) {
                this.price += 1.00;
            }
        }
    }

}
