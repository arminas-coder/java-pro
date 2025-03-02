
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

       System.out.println("Enter numbers (end with 9999): ");

       while (true) {
           int input = scanner.nextInt();
           if (input == 9999) {
               break;
           }
           list.add(input);
       }
       if (!list.isEmpty()) {
           int smallest = list.get(0);
           for (int number : list) {
               if (number < smallest) {
                   smallest = number;
               }
           }

           System.out.println("Smallest number: " + smallest);

           System.out.println("Found at index: ");
           for (int i = 0; i < list.size(); i++) {
               if (list.get(i) == smallest) {
                   System.out.println(i);
               }
           }
       } else {
           System.out.println("List is empty.");
       }
        
    }
}
