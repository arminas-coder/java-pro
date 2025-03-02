
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter numbers (end with -1): ");

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }

        if (!list.isEmpty()) {
            int sum = 0;
            for (int number : list) {
                sum += number;
            }
            double average = (double) sum / list.size();

            System.out.println("Average: " + average);
         } else {
            System.out.println("List is empty.");
        }

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
