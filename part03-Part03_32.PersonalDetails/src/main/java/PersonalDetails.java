
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int longcount = 0;
        String longname = "";

        while (true) {
            String input = String.valueOf(scanner.nextLine());

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            for (int i = 0; i < parts.length; i++) {
                if (parts[0].length() > longcount) {
                    longcount = parts[0].length();
                    longname = parts[0];
                }
                sum += Integer.valueOf(parts[1]);
                count = count + 1;

            }

        }
        System.out.println("Longest name: " + longname);

        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
