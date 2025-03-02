import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite reikšmes (baigti su tuščia eilute):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            list.add(input);
        }

        if (!list.isEmpty()) {
            String lastElement = list.get(list.size() - 1);
            System.out.println("Paskutinė įvesta reikšmė: " + lastElement);
        } else {
            System.out.println("Sąrašas tuščias.");
        }
    }
}