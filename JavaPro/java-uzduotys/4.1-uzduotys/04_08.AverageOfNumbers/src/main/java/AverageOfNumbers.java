
import java.util.Scanner;

public class AverageOfNumbers {

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
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of the numbers: " + average);
        } else {
            System.out.println("No numbers were entered");
        }
        scanner.close();

    }
}
