
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;
        int start = 1;

        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());

        /*
         * for (int j = 1; j <= input; j++) {
         * factorial *= j;
         * }
         * System.out.println("Factorial: " + factorial);
         */

       /* while (start <= input) {
            factorial *= start;
            start++;
        }
        System.out.println(factorial); */

        for (int j = start; j <= input; j++) {
            factorial *= j;
        }

        System.out.println("Factorial: " + factorial);
        
       

    }

}
