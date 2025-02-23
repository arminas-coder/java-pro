
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
