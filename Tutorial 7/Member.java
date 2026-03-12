import java.util.LinkedList;

public class Member {

    private String name;
    private int memberId;
    private LinkedList<Book> borrowedBooks;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        borrowedBooks = new LinkedList<>();
    }

    public int getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.lendBook();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by the member.");
        }
    }
}
