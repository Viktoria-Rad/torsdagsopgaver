public class ArrayFejl {

    public static void printTreForsteElementer(String[] array) {
        try {
            System.out.println("Første element: " + array[0]);
            System.out.println("Andet element: " + array[1]);
            System.out.println("Tredje element: " + array[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fejl, fordi der kun er tre elementer i arrayet");
        }

    }

    public static void main(String[] args) {
        String[] navne1 = {"Anna", "Bob", "Clara", "David"};
        String[] navne2 = {"Eva", "Frank"};

        ArrayFejl.printTreForsteElementer(navne1);
        printTreForsteElementer(navne2);
    }
}
