
    import java.util.Scanner;

class Room {
    private String code;
    private int seats;

    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }
    public String getCode() {
        return code;
    }
    public int getSeats() {
        return seats;
    }
}

    public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Room lectureHall = new Room("A101", 100);
        System.out.println("Room Code: " + lectureHall.getCode());
        System.out.println("Number of seats: " + lectureHall.getSeats());


    }

}
