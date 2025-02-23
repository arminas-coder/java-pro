
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            System.out.print("Give a number: ");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            sum += number;
            count++;

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Thx! Bye!");
        if (count > 0) {
            System.out.println("Sum: " + sum);
            System.out.println("Numbers: " + count);
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println("Even numbers: " + evenCount);
            System.out.println("Odd numbers: " + oddCount);
        } else {
            System.out.println("No numbers were entered.");
        }

        scanner.close();
    }
}