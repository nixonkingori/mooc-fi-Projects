
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int start = 0;
       int sum = 0;
        System.out.println("Last number?");
       int end  = Integer.valueOf(scanner.nextLine());

       while (start < end) {
        start ++;
        sum += start;
        
       }

        System.out.println(sum);
    }
}
