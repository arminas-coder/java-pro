import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Value of the gift? ");
        double giftValue = scanner.nextDouble();

        double tax = 0;

        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue <= 25000) {
            tax = 100 + (giftValue - 5000) * 0.08;
        } else if (giftValue <= 55000) {
            tax = 1700 + (giftValue - 25000) * 0.10;
        } else if (giftValue <= 200000) {
            tax = 4700 + (giftValue - 55000) * 0.12;
        } else if (giftValue <= 1000000) {
            tax = 22100 + (giftValue - 200000) * 0.15;
        } else {
            tax = 142100 + (giftValue - 1000000) * 0.17;
        }

        if (giftValue >= 5000) {
            System.out.println("Tax: " + tax);
        }

        scanner.close();
    }
}