import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Give a number: ");
        int number = scanner.nextInt();
        System.out.println("You gave the number " + number);

        scanner.close();
    }
}