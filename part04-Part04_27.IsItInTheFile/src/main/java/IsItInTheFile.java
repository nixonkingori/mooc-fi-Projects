
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try (Scanner scannerTwo = new Scanner(Paths.get(file))) {

            while (scannerTwo.hasNextLine()) {
                list.add(scannerTwo.nextLine());
            }

            System.out.println("Search for:");
            while (true) {

                String searchedFor = scanner.nextLine();

                if (list.contains(searchedFor)) {
                    System.out.println("Found!");
                    break;
                } else {
                    System.out.println("Not found.");
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println("Reading the file" + file + "failed");
        }

    }
}
