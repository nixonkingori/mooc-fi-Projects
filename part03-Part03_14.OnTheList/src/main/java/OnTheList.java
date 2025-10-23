
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String searchInput = scanner.nextLine();
        boolean isFound = false;

        for (int i = 0; i < list.size(); i++) {
            if (searchInput.equals(list.get(i))) {
                System.out.println(searchInput + " was found!");
                isFound = true;
                break;
            }
                
            
        }
        if (!isFound){
        System.out.println(searchInput + " was not found!");
        }

    }
}
