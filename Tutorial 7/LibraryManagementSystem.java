import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();
        ArrayList<Member> members = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Add Member");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String title = input.nextLine();
                    System.out.print("Enter author: ");
                    String author = input.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter member name: ");
                    String name = input.nextLine();
                    System.out.print("Enter member ID: ");
                    int id = input.nextInt();
                    members.add(new Member(name, id));
                    System.out.println("Member added.");
                    break;

                case 4:
                    System.out.print("Enter member ID: ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter book title: ");
                    title = input.nextLine();

                    Member m = findMember(members, id);
                    Book b = library.checkAvailability(title);

                    if (m != null && b != null) {
                        m.borrowBook(b);
                    } else {
                        System.out.println("Member or Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter member ID: ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter book title: ");
                    title = input.nextLine();

                    m = findMember(members, id);
                    b = library.checkAvailability(title);

                    if (m != null && b != null) {
                        m.returnBook(b);
                    } else {
                        System.out.println("Member or Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 6);

        input.close();
    }

    private static Member findMember(ArrayList<Member> members, int id) {
        for (Member m : members) {
            if (m.getMemberId() == id) {
                return m;
            }
        }
        return null;
    }
}
