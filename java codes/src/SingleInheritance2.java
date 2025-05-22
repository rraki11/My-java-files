import java.util.Scanner;

class Book_details {
    Scanner scan = new Scanner (System.in);

    String title;
    String author;
    double price;

    void book_details() {
        System.out.println("Enter the book name: ");
        title = scan.nextLine();

        System.out.println("Enter the book's author name: ");
        author = scan.nextLine();

        System.out.println("Enter the price of the book: ");
        price = scan.nextDouble();
        scan.nextLine();
    }

    void display_details() {
        System.out.println("------------------------------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}

class Issued_book extends Book_details{
    String Issued_to;
    String Due_date;

    void issue_details() {
        System.out.println("Issued to: ");
        Issued_to = scan.nextLine();

        System.out.println("Due date: ");
        Due_date = scan.nextLine();
    }

    void show_issues() {
        System.out.println("Issued to: " + Issued_to);
        System.out.println("Due date: " + Due_date);
        System.out.println("------------------------------");
    }
}

public class SingleInheritance2 {
    public static void main (String[] args) {
        Issued_book rr = new Issued_book();

        rr.book_details();
        rr.issue_details();
        rr.display_details();
        rr.show_issues();
    }
}
