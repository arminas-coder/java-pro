
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give a number:");
                int number = scan.nextInt();

                if (number > 0 ){
                    System.out.println("Number is positive! ");
        } else {
                    System.out.println("Number is not positive! ");
                }
                scan.close();
    }
}
