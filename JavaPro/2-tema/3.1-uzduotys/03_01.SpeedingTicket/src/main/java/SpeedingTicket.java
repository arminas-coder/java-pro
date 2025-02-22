
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Give speed: ");
    int speed = scanner.nextInt();

    if (speed > 120) {
        System.out.println("Speed ticket!");
    } else {
        System.out.println(speed);
    }
        scanner.close();
    }
}
