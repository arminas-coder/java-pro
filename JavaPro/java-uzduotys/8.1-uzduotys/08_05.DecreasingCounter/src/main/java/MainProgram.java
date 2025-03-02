
public class MainProgram {
    public static void main(String[] args) {

        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        for (int i = 0; i < 100; i++) {
            counter.decrement();
        }

        counter.printValue();
        counter.decrement();
        counter.printValue();
    }
}
