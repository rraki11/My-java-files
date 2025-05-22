import java.util.Scanner;

class library {
    Scanner sc = new Scanner(System.in);
    String libraryname;
    String location;

    void inputlibrarydetails() {
        System.out.println("Enter the Library name: ");
        libraryname = sc.nextLine();
        System.out.println("Enter the Location: ");
        location = sc.nextLine();
    }

    void displaylibrarydetails() {
        System.out.println("------------------------------");
        System.out.println("Library name: " + libraryname);
        System.out.println("Location: " + location);
    }
}

class book extends library {
    String title;
    String author;
    String ISBN;

    void inputbookdetails() {
        System.out.println("Enter book title: ");
        title = sc.nextLine();
        System.out.println("Enter the author name: ");
        author = sc.nextLine();
        System.out.println("ISBN (International Standard Book Number): ");
        ISBN = sc.nextLine();
    }

    void displaybookdetails() {
        System.out.println("Book title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN (International Standard Book Number): " + ISBN);
    }
}

class member extends library {
    String membername;
    int memberid;

    void inputmemberdetails() {
        System.out.println("Member name: ");
        membername = sc.nextLine();
        System.out.println("Member ID: ");
        memberid = sc.nextInt();
    }

    void displaymemberdetails() {
        System.out.println("Member name: " + membername);
        System.out.println("Member ID: " + memberid);
        System.out.println("------------------------------");
    }
}

public class HierarchicalInhertance2 {
    public static void main(String[] args) {
        book rr1 = new book();
        library rr2 = new library();
        member rr3 = new member();

        rr2.inputlibrarydetails();
        rr1.inputbookdetails();
        rr3.inputmemberdetails();

        rr2.displaylibrarydetails();
        rr1.displaybookdetails();
        rr3.displaymemberdetails();
    }
}
