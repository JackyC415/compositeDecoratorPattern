package composite;

import java.util.ArrayList;

public class BurgerComposite implements BurgerComponent {

    private String description;
    public ArrayList<String> options = new ArrayList<>();

    public BurgerComposite ( String description )
    {
        this.description = description ;
    }

    public void printDescription() {
        System.out.println(description);
        String test = "";
        for(int i = 0; i < options.size(); i++) {
            if(options.size() > 1) {
                test += options.get(i) + ", ";
            }
        }
        System.out.println(test.replaceAll(", $", ""));
    }

    public void addChild(String s) {
        options.add(s);
    }
}
