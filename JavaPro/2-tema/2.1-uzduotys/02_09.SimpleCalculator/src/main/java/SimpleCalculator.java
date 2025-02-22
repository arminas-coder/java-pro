
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Give a second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quoitent = (double) firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
        System.out.println(firstNumber + " / " + secondNumber + " / " + quoitent);

        scanner.close();


    }
}
