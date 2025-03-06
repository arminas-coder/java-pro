
public class MainProgram {
    public static void main(String[] args) {

        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);

        Person defaultPerson = new Person();
        System.out.println(defaultPerson);

        Person namedPerson = new Person("Eva");
        System.out.println(namedPerson);

    }
}