
public class Person {
    private String name;
    private Pet pet;

    // Konstruktorius su asmens vardu ir augintiniu
    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    // Konstruktorius su asmens vardu (augintinis su numatytais parametrais)
    public Person(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }

    // Konstruktorius be parametrų (numatytieji asmens vardas ir augintinis)
    public Person() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    // Pakeistas toString() metodas
    @Override
    public String toString() {
        return this.name + ", has a friend called " + pet.getName() + " (" + pet.getBreed() + ")";
    }
}
