
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite skaičius (Parašius -1 programa baigta): ");

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }
        System.out.println("Įvesti skaičiai: ");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
