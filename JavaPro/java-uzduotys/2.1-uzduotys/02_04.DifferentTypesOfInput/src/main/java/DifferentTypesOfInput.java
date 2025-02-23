
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give a string: ");
        String stringInput = scan.nextLine();

        System.out.print("Give a integer: ");
        int intInput = scan.nextInt();

        System.out.print("Give a double: ");
        double doubleInt = scan.nextDouble();

        System.out.print("Give a boolean: ");
        boolean trueOrFalse = Boolean.valueOf(scan.next());

        System.out.println("You gave a string: " + stringInput);
        System.out.println("You gave a integer: " + intInput);
        System.out.println("You gave a double:" + doubleInt);
        System.out.println("You gave a boolean: " + trueOrFalse);

        scan.close();

    }
}
