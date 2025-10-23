

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(9);


    }
    public static void printFromNumberToOne(int input) {
        int end = 1;

        while (input >= end) {
            System.out.println(input);
            input--;
        }
    }

    


}
