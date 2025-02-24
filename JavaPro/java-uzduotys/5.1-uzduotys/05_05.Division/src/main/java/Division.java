

public class Division {
    public static void main(String[] args) {
        division(3, 2);
        division(10, 3);
    }

    // Apibrėžiu division metoda
    public static void division(int numerator, int denominator) {
        // Konvertuoju į double
        double result = (double) numerator / denominator;

        System.out.println(result);
    }
}
