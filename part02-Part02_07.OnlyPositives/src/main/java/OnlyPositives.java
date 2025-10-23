
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int reply = Integer.valueOf(scanner.nextLine());
            if (reply == 0) {
                break;
            }
            if (reply < 0){
                System.out.println("Unsuitable number");
                continue;
            }
            if (reply > 0) {
                System.out.println(Math.pow(reply, 2));
            }
        }
        

        }
    }

