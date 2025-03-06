
public class Main {

    static class A {
        public void a() {
            System.out.println("A");
        }
    }

    static class B extends A {
        public void b() {
            System.out.println("B");
        }
    }

    static class C extends B {
        public void c() {
            System.out.println("C");
        }
    }

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        System.out.println("---");

        C c2 = new C();

        c2.a();
        c2.b();
        c2.c();
    }
}
