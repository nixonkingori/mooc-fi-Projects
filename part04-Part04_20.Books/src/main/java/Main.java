import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // implement here the program that allows the user to enter
        // book information and to examine them

        while (true) {
            System.out.print("Title:");
            String bookName = scanner.nextLine();
            if (bookName.equals("")) {
                break;
            }

            System.out.print("Pages:");
            int pageNumber = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year:");
            int productionYear = Integer.valueOf(scanner.nextLine());

            Book mybooks = new Book(bookName, pageNumber, productionYear);
            books.add(mybooks);

        }

        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();


        for (Book mybooks : books) {

            if (answer.equals("everything")) {
                System.out.println(mybooks.getName() + ", " +  mybooks.getPages()+" pages" + ", " +  mybooks.getYear());
            } else if (answer.equals("name")) {
                System.out.println(mybooks.getName());
            }

        }
    }
}
