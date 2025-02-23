
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Give the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Give the third number: ");
        int thirdNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;

        System.out.println("The sum of numbers is " + sum);

        scanner.close();

    }
}
