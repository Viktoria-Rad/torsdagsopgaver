import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ArrayList<Customer> customers = new ArrayList<>();
    customers.add(new Customer("Hanna", "Pedersen", "AP"));
    customers.add(new Customer("Valeria", "Radchenko", "VR"));
    customers.add(new Customer("Amelia", "Radchenko", "AR"));

    printCustomers(customers);
    }

    public static void printCustomers(ArrayList <Customer> customers){
        for(Customer c : customers) {
         System.out.println(c);
        }
        }
    }
