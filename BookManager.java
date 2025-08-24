import java.util.Scanner;

public class BookManager {
    private Book[] books = new Book[100];
    private int count = 0;
    private Scanner sc = new Scanner(System.in);

    public void addBooks() {
        System.out.print("Enter number of books to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();
            System.out.print("Enter Book Author: ");
            String author = sc.nextLine();

            books[count++] = new Book(id, title, author);
        }
        System.out.println("Books added successfully.\n");
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books to display.\n");
            return;
        }

        System.out.println("Book List:");
        for (int i = 0; i < count; i++) {
            Book b = books[i];
            System.out.println("ID: " + b.getBookId() + ", Title: " + b.getTitle() + ", Author: " + b.getAuthor() + ", Issued: " + b.isIssued());
        }
        System.out.println();
    }

    public void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int id = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == id) {
                Book b = books[i];
                System.out.println("Found: Title: " + b.getTitle() + ", Author: " + b.getAuthor() + ", Issued: " + b.isIssued());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.\n");
        }
    }

    public void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == id) {
                if (!books[i].isIssued()) {
                    books[i].setIssued(true);
                    System.out.println("Book issued successfully.\n");
                } else {
                    System.out.println("Book is already issued.\n");
                }
                return;
            }
        }

        System.out.println("Book not found.\n");
    }

    public void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == id) {
                if (books[i].isIssued()) {
                    books[i].setIssued(false);
                    System.out.println("Book returned successfully.\n");
                } else {
                    System.out.println("Book was not issued.\n");
                }
                return;
            }
        }

        System.out.println("Book not found.\n");
    }
}