
import java.util.Scanner;

import javax.naming.directory.DirContext;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int reply = Integer.valueOf(scanner.nextLine());
            if (reply == 4) {
                break;
            }
        }

    }
}
