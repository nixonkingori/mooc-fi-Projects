
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*   int sum = 0;

        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());

        /*
         * for (int j = first; j <= last; j++ ) {
         * sum += j;
         * }
         * System.out.println("The sum is " + sum);
         */
      /* while (first <= last) {
            sum += first;
            first++;

        }
        System.out.println("The sum is " + sum); */

        int sum = 0;
        System.out.println("First number?");
        int start = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int end  = Integer.valueOf(scanner.nextLine());
 
        while (start <= end) {
         
         sum += start;
         start ++;
         
        }
 
         System.out.println("The sum is " + sum);
    }
}
