
import java.util.ArrayList;

public class Main {
    // Person klasė
    static class Person {
        private String name;
        private String address;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        @Override
        public String toString() {
            return this.name + "\n" + this.address;
        }
    }

    static class Student extends Person {
        private int credits;

        public Student(String name, String address) {
            super(name, address);
            this.credits = 0;
        }

        public void study() {
            this.credits++;
        }

        public int credits() {
            return this.credits;
        }

        @Override
        public String toString() {
            return super.toString() + "\nStudy credits " + this.credits;
        }
    }

    static class Teacher extends Person {
        private int salary;

        public Teacher(String name, String address, int salary) {
            super(name, address);
            this.salary = salary;
        }

        @Override
        public String toString() {
            return super.toString() + "\nsalary " + this.salary + " euro/month";
        }
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {

        Person ada = new Person("Ada Lovelace", "24 Maddox St. London MI5 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        System.out.println("---");

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits " + ollie.credits());

        System.out.println("---");

        Teacher adaTeacher = new Teacher("Ada Lovelace", "24 Maddox St. London MI5 2QN", 1200);
        Teacher eskoTeacher = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(adaTeacher);
        System.out.println(eskoTeacher);

        System.out.println("---");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London MI5 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
        printPersons(persons);
    }
}
