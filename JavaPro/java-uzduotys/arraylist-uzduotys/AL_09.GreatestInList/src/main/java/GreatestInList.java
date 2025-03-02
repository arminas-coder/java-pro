
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers (stop by entering -1): ");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        if (!list.isEmpty()) {
            int greatest = list.get(0);

            for (int i = 1; i < list.size(); i++) {
                int number = list.get(i);
                if (number > greatest) {
                    greatest = number;
                }
            }
            System.out.println("The greatest number: " + greatest);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
