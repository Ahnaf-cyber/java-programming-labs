import java.util.LinkedList;

public class Library {

    private LinkedList<Book> catalogue;

    public Library() {
        catalogue = new LinkedList<>();
    }

    public void addBook(Book book) {
        catalogue.add(book);
        System.out.println("Book added to library.");
    }

    public void removeBook(String title) {
        for (Book b : catalogue) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                catalogue.remove(b);
                System.out.println("Book removed.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public Book checkAvailability(String title) {
        for (Book b : catalogue) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("\nLibrary Catalogue:");
        for (Book b : catalogue) {
            System.out.println(b);
        }
    }
}
