
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        // Sukuriamas ArrayList, skirtas saugoti vartotojo įvestis
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Įveskite vardus (baigti su tuščia eilute):");

        // Skaitoma vartotojo įvestis
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break; // Baigiama skaityti, jei įvestis tuščia
            }
            list.add(input); // Pridedama įvestis prie sąrašo
        }

        // Atspausdinamas sąrašo dydis
        System.out.println("Iš viso: " + list.size());
    }
}
