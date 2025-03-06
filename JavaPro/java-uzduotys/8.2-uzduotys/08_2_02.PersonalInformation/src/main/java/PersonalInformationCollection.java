import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();

        while (true) {

            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            int identificationNumber = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Identification number: ");
                try {
                    identificationNumber = Integer.parseInt(scanner.nextLine());
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error. Identification number should be numbers!!!");
                }
            }

            PersonalInformation info = new PersonalInformation(firstName, lastName, identificationNumber);

            infoCollection.add(info);
        }

        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

        scanner.close();
    }
}
