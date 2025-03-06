
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static class Book {
        private String title;
        private int pages;
        private int publicationYear;

        public Book(String title, int pages, int publicationYear) {
            this.title = title;
            this.pages = pages;
            this.publicationYear = publicationYear;
        }

        public String getTitle() {
            return title;
        }

        public int getPages() {
            return pages;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        @Override
        public String toString() {
            return this.title + ", " + this.pages + " pages, " + this.publicationYear;
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication Year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, pages, publicationYear);
            books.add(book);
        }

        System.out.println("What information will be printed? ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
                } else if (choice.equalsIgnoreCase("name")) {
                    for (Book book : books) {
                        System.out.println(book.getTitle());
                    }
                } else {
                    System.out.println("Invalid choice.");
                }
            }
        }

