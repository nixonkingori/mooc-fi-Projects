
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }

            String[] peices = input.split(" ");

            for (int i = 0; i < peices.length; i++) {
                System.out.println(peices[i]);
            }
            
        }
        


    }
}
