
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String prompt = scanner.nextLine();

        try (Scanner scanners = new Scanner(Paths.get(prompt))){

            while (scanners.hasNextLine()) {

                String row = scanners.nextLine();

                System.out.println(row);
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

    }
}
