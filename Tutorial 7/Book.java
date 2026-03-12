public class Book {

    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void lendBook() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               ", Author: " + author +
               ", Available: " + available;
    }
}
