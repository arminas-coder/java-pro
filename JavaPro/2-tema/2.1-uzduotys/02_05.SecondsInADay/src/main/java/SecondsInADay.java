
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many days would you like to convert into seconds? ");
        int days = scanner.nextInt();
        int seconds = days * 86400;

        System.out.println(seconds);

        scanner.close();

    }
}
