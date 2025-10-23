
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string:");
        String word = String.valueOf(scanner.nextLine());
        
        System.out.println("Give an integer:");
        int value = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double:");
        double point = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean state = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + word);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + point);
        System.out.println("You gave the boolean " + state);

    }
}
