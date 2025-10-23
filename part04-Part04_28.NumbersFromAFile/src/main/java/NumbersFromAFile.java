
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.print("File? ");
        String givenfile = scanner.nextLine();

        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner scannerTwo = new Scanner(Paths.get(givenfile))) {

            while (scannerTwo.hasNextLine()) {
                int num = Integer.valueOf(scannerTwo.nextLine());
                list.add(num);
            }
            System.out.print("Lower bound? ");
            int lowerBound = Integer.valueOf(scanner.nextLine());
            System.out.print("Upper bound? ");
            int upperBound = Integer.valueOf(scanner.nextLine());

            for (int num : list) {
                if (num >= lowerBound && num <= upperBound) {
                    count++;
                }
            }

            System.out.println("Numbers: " + count);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
