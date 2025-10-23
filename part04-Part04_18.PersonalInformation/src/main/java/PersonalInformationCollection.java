
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name:");
            String first = scanner.nextLine();
            if (first.equals("")) {
                break;
            }

            System.out.println("Last name:");
            String last = scanner.nextLine();

            System.out.println("Identification number:");
            String idNumber = scanner.nextLine();

            PersonalInformation personInfo = new PersonalInformation(first, last, idNumber);
            infoCollection.add(personInfo);

        }

        for(PersonalInformation PersonalInformation: infoCollection){
            System.out.println(PersonalInformation.getFirstName()+ " " + PersonalInformation.getLastName());
        }
    }
}
