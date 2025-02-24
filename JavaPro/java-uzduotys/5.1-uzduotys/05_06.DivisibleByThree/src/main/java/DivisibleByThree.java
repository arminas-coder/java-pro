
import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(3, 6);
        divisibleByThreeInRange(2, 10);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            // Patikrinu ar dalijasi iš 3
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}