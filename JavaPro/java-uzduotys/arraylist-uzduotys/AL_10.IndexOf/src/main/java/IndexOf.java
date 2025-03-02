
import javax.naming.directory.SearchControls;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers (end with -1): ");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search number? ");
        int searchNumber = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchNumber) {
                System.out.println(searchNumber + " is at index: " + i);
            }
        }

    }
}
