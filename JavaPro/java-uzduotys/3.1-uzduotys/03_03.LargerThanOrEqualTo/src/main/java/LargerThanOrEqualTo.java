
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give a first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Give a second number: ");
        int secondNumber = scan.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The largest number is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("The larger number is: " + secondNumber);
        } else {
            System.out.println("Numbers are equals!");
        }
        scan.close();

    }
}
