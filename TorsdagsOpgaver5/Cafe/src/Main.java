import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cafe myCafe = new Cafe();

        myCafe.loadMenuData();

        ArrayList<String> menu = myCafe.getCoffeeMenu();
        for( String coffee: menu){
            System.out.println(coffee);

        }


    }
}