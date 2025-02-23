
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Give a number:  ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            if (number > 0) {
                sum += number;
                count++;
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of positive number: " + average);
        } else {
            System.out.println("Cannot calculate the avergae");
        }

        scanner.close();

    }
}
