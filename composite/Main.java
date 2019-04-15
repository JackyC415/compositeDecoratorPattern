package composite;

public class Main {

    public static void main(String[] args) {

        BurgerComposite customBurger = new BurgerComposite("Build Your Own Burger!");
        customBurger.addChild("Chicken + 2/3lb. + In A Bowl"); //burger 2/3lb +$11.50, bowl +$1.00
        customBurger.addChild("Danish Blue Cheese"); //first cheese free
        customBurger.addChild("Jalapeno Jack"); //second cheese +$1.00
        customBurger.addChild("Yellow American"); //third cheese +$1.00
        customBurger.addChild("Hard Boiled Eggs"); //first topping free
        customBurger.addChild("Lettuce Blend"); //second topping free
        customBurger.addChild("Organic Mixed Greens"); //third topping free
        customBurger.addChild("Scallions"); //fourth topping free
        customBurger.addChild("Sprouts"); //fifth topping +$0.75
        customBurger.addChild("Avocado"); //first premium topping +$1.50
        customBurger.addChild("Fried Egg"); //second premium topping +$1.50
        customBurger.addChild("Basil Pesto"); //first sauce free
        customBurger.addChild("Peanut Sauce"); //second sauce +$0.75
        customBurger.printDescription();
        Burger burgerPrice = new Cheese(new Toppings(new Premium(new Sauce(new ConcreteBurger()))));
        //Subtotal should be: Burger($12.50) + Cheese($2.00) + Topping($0.75) + Premium($3.00) + Sauce($0.75) = $19.00
        System.out.println("Subtotal: " + burgerPrice.setOptions(customBurger.options));
    }
}
