
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Give a number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        System.out.println("Number of numbers is: " + count);
        System.out.println("Sum of numbers is: " + sum);
        scanner.close();

    }
}
