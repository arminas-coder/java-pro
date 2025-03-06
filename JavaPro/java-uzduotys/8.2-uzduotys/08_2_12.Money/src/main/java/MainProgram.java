
public class MainProgram {
    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);

        System.out.println(a); // 10.00e
        System.out.println(b); // 5.00e
        System.out.println(c); // 15.00e

        a = a.plus(c); // NB: a new Money object is created

        System.out.println(a); // 25.00e
        System.out.println(b); // 5.00e
        System.out.println(c); // 15.00e

        Money d = new Money(10, 0);
        Money e = new Money(3, 50);

        Money f = d.minus(e);

        System.out.println(d); // 10.00e
        System.out.println(e); // 3.50e
        System.out.println(f); // 6.50e

        f = f.minus(d); // NB: a new Money object is created

        System.out.println(d); // 10.00e
        System.out.println(e); // 3.50e
        System.out.println(f); // 0.00e

        Money g = new Money(10, 0);
        Money h = new Money(3, 0);
        Money i = new Money(5, 0);

        System.out.println(g.lessThan(h)); // false
        System.out.println(h.lessThan(i)); // true
    }
}
