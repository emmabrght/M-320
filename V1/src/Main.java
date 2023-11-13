import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        ArrayList<String> list = myStack.getElements();

        myStack.push("1");
        myStack.push("2");
        myStack.push("3");

        System.out.println(myStack.next() + "\n");

        myStack.remove();

        for (String stack:list) {
            System.out.println(stack);
        }



        // Output should be:
        // Next Element: 1
        // Next Element: 2
        // Next Element: 3
    }
}