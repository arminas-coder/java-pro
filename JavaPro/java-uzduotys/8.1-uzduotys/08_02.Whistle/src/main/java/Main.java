class Whistle {
    private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println(this.sound);
    }
}

public class Main {

    public static void main(String[] args) {

        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

       duckWhistle.sound();
       roosterWhistle.sound();
       duckWhistle.sound();
    }
}








