package composite;

public class BurgerLeaf implements BurgerComponent {

    private String description;

    public BurgerLeaf (String description)
    {
        this.description = description;
    }

    public void printDescription() {
        System.out.println(description);
    }

    public void addChild(String s) { }

}
