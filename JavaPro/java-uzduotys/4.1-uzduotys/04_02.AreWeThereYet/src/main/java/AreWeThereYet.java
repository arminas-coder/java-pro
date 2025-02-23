
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = scanner.nextInt();

        while (number != 4) {
            System.out.println("Give a number: ");
            number = scanner.nextInt();
        }
        scanner.close();
    }
}
