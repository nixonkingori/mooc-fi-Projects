
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int greater = 0;
        String name = "";

        while (true) {
            String input = String.valueOf(scanner.nextLine());

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            for(int i = 0; i < parts.length; i++) {
                if(Integer.valueOf(parts[1]) > greater) {
                    greater = Integer.valueOf(parts[1]);
                    name = parts[0];

                }
            }

        }

        System.out.println("Name of the oldest: " + name);

    }
}
