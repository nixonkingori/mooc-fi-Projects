import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name:");
            String movieName = scanner.nextLine();

            if (movieName.equals("")) {
                break;
            }

            System.out.print("Duration:");
            int movieTime = Integer.valueOf(scanner.nextLine());

            TelevisionProgram program = new TelevisionProgram(movieName, movieTime);
            programs.add(program);

        }
        System.out.println("");
        System.out.println("Program's maximum duration?");
        int programDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= programDuration) {
                System.out.println(program);
            }
        }

    }
}
