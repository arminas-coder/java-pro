import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int end = scanner.nextInt();

        System.out.print("Where from? ");
        int start = scanner.nextInt();

        if (start <= end) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}