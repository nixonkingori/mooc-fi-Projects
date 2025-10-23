
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numAmount= 0;
        double sumOfNum = 0;
        

        while(true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                numAmount = numAmount +1;
                sumOfNum = sumOfNum + input;
            }
        }
        double average = sumOfNum / numAmount;
        System.out.println("Average of the numbers: " + average);
    }
}
