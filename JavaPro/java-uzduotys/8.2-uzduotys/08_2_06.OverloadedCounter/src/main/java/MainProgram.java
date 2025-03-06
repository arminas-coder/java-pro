import java.sql.SQLOutput;

public class MainProgram {

    static class Counter {
        private int value;

        public Counter(int startValue) {
            this.value = startValue;
        }

        public Counter() {
            this(0);
        }

        public int value() {
            return this.value;
        }

        public void increase() {
            this.value++;
        }

        public void decrease() {
            this.value--;
        }

        public void increase(int increaseBy) {
            if (increaseBy > 0) {
                this.value += increaseBy;
            }
        }
        public void decrease(int decreaseBy) {
            if (decreaseBy > 0) {
                this.value -= decreaseBy;
            }
        }
    }

    public static void main(String[] args) {

        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        System.out.println("Counter 1: " + counter1.value());
        System.out.println("Counter 2: " + counter2.value());

        counter1.increase();
        counter2.increase(5);

        counter1.decrease();
        counter2.decrease(2);

        System.out.println("Counter 1 after changes: " + counter1.value());
        System.out.println("Counter 2 after changes: " + counter2.value());

        counter1.increase(-10);
        counter2.decrease(-5);

        System.out.println("Counter 1 after invalid changes: " + counter1.value());
        System.out.println("Counter 2 after invalid changes: " + counter2.value());
    }
}
