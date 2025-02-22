
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Give as second number: ");
        int secondNumber = scanner.nextInt();

        int product = firstNumber * secondNumber;

        System.out.println(firstNumber + "*" + secondNumber + "=" + product);

        scanner.close();

    }
}
