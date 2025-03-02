
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Įveskite reikšmes: ");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);

        }
        if (list.size() >= 2) {
            String firstElement = list.get(0);
            String lastElement = list.get(list.size() - 1);

            System.out.println("Pirmoji reikšmė:" + firstElement);
            System.out.println("Paskutinė reikšmė: " + lastElement);
        } else {
            System.out.println("Sąraše turi būtį bent du elementai.");
        }

    }
}
