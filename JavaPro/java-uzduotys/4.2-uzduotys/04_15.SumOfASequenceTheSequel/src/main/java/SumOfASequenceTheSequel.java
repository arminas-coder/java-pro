
import java.util.Scanner;

public class SumOfASequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the interval: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the interval: ");
        int end = scanner.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("The sum of the sequence from " + start + " to " + end + " is " + sum);

        scanner.close();
    }
}