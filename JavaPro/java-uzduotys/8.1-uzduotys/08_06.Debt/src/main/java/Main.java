class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    public void printBalance() {
        System.out.println(balance);
    }
    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
    }
}

public class Main {

    public static void main(String[] args) {
        Debt mortgage = new Debt(12000, 1.01);

        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;
        while (years < 30) {
            mortgage.waitOneYear();
            years = years + 1;
        }
        mortgage.printBalance();

    }
}
