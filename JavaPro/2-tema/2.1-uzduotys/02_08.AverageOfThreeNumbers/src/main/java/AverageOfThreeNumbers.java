
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Give a second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Give a third number: ");
        int thirdNumber = scanner.nextInt();

        double average = firstNumber + secondNumber + thirdNumber;

        System.out.println("The average number of three is " + average);

        scanner.close();

    }
}
