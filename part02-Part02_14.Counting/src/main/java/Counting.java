
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();

            int start = 0;
            int end = Integer.valueOf(scanner.nextLine());

            while(start <= end){
               System.out.println(start);
                start++;
            }
        }
    }
}
