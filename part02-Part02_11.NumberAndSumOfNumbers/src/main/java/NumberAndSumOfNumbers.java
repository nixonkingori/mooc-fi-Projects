
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int numbersInputted = 0;
       int SumOfNumbers = 0;

       while (true) {
        System.out.println("Give a number:");
        int userInput = Integer.valueOf(scanner.nextLine());
        if (userInput == 0) {
            break;
        } else {
            numbersInputted = numbersInputted + 1;
            SumOfNumbers = SumOfNumbers + userInput;
        }
       }
       System.out.println("Number of numbers: " + numbersInputted);
       System.out.println("Sum of the numbers: " + SumOfNumbers);
    }
}
