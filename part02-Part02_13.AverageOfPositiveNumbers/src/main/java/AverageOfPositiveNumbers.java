
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     int num = 0;
     int sum = 0;

      while (true) {
        System.out.println("give a number");
        int input = Integer.valueOf(scanner.nextLine());
         
         if (input > 0) {
            num = num + 1;
            sum = sum + input;
        }
         if (input != 0 ) {
        } else {
            break;
        } 
       
      }
     // System.out.println(num);
     // System.out.println(sum);
      if (sum <= 0) {
        System.out.println("Cannot calculate the average");
      } else {
        double avg = (double) sum / num;
        System.out.println(avg);
      }
} 
} 
