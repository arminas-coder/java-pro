

public class FromParameterToOne {
    public static void main(String[] args) {
        // Iškviečiu metoda su skirtingais parametrais
        printFromNumberToOne(5);
        printFromNumberToOne(2);
    }

    public static void printFromNumberToOne(int number) {
        // For ciklas, kad spausdintų nuo 1
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
