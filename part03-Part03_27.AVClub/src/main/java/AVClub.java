
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }

            String[] broken = input.split(" ");

            for (int i = 0; i < broken.length; i++) {
                if (broken[i].contains("av")) {
                    System.out.println(broken[i]);
                }
            }

        }

    }
}
