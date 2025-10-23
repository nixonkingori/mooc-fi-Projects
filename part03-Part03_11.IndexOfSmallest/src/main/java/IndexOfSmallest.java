
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            numbers.add(input);
        }

            // after that, the program prints the smallest number
            // and its index -- the smallest number
            // might appear multiple times
            int indicator = 0;

           for (int i = 0; i < numbers.size(); i++) {
               int num = numbers.get(i);
                if (numbers.get(0) > num) {
                    indicator = i;
                   
                }
                System.out.println("Smallest number: " + num);
                    System.out.println("Found at index: " + indicator);

            }

        }
   }

