import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Items {
    private List<Item> itemList;

    public Items() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void readItemsFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item newItem = new Item(name);
            addItem(newItem);
        }
        scanner.close();
    }

    public void printItems() {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }

    public static void main(String[] args) {
        Items items = new Items();
        items.readItemsFromUser();
        items.printItems();
    }
}