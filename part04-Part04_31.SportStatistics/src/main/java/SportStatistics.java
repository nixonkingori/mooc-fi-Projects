
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gameCount = 0;
        int wins = 0;
        int losses = 0;

        System.out.println("file");
        String inputFile = String.valueOf(scan.nextLine());
        System.out.println("Team:");
        String inputTeam = String.valueOf(scan.nextLine());

        try (Scanner scannerTwo = new Scanner(Paths.get(inputFile))) {
            while (scannerTwo.hasNextLine()) {
                String line = scannerTwo.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                String homeTeamScore = parts[2];
                String awayTeamScore = parts[3];

                if (homeTeam.equals(inputTeam) || awayTeam.equals(inputTeam)) {
                    gameCount++;

                    if (homeTeam.equals(inputTeam) && Integer.valueOf(homeTeamScore) > Integer.valueOf(awayTeamScore) || awayTeam.equals(inputTeam) && Integer.valueOf(awayTeamScore) > Integer.valueOf(homeTeamScore)) {
                        wins++;
                    } else {
                        losses++;
                    }

                }

            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
