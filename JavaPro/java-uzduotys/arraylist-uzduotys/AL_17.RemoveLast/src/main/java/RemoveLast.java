
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");

        System.out.println(list);

        removeLast(list);
        removeLast(list);

        System.out.println(list);
    }

    public static void removeLast(ArrayList<String> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }

}
