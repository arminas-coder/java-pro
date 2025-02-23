
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Shall we carry on? ");
            String atsakymas = scanner.nextLine();

            if (atsakymas.equalsIgnoreCase("no")) {
                break;
            }
        }
        scanner.close();

    }
}
