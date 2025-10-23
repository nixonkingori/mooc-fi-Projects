
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int numcount = 0;

       while (true) {
        System.out.println("Give a number:");
        int givennumber = Integer.valueOf(scanner.nextLine());
        if (givennumber == 0) {
            break;
        } else {
            numcount = numcount + 1;
        }
       }
       System.out.println("Number of numbers: " + numcount);
    }
}
