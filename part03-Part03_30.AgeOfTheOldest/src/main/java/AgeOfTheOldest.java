
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int greater = 0;

        while (true) {
            String input = String.valueOf(scanner.nextLine());

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            for(int i = 0; i < parts.length; i++) {
                if(Integer.valueOf(parts[1]) > greater) {
                    greater = Integer.valueOf(parts[1]);

                }
            }

        }

        System.out.println("Age of the oldest: " + greater);

    }
}
