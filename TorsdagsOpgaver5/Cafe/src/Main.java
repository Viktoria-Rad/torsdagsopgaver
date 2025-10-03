import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cafe myCafe = new Cafe();

        myCafe.loadMenuData();

       // ArrayList<String> menu = myCafe.getCoffeeMenu();
        for( String coffee: myCafe.getCoffeeMenu()){
            System.out.println(coffee);

        }


    }
}