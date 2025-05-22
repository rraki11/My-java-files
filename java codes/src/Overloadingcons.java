import java.util.Scanner;

class Myclass {
    Scanner sc = new Scanner(System.in);
    int length;
    int breadth;

    Myclass(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Myclass(int length) {
        this.length = length;
        //System.out.println("enter the size of breadth: ");
        //breadth = sc.nextInt();
        try (Scanner sc = new Scanner(System.in)) { 
            System.out.println("Enter the size of breadth: ");
            breadth = sc.nextInt();
        }
    }

    float display() {
        return (float)length * breadth;
    }

    public void closeScanner() {
        if (sc != null) {
            sc.close();
        }
    }
}

public class Overloadingcons {
    public static void main(String[] args) {
        Myclass rr = new Myclass(19,20);
        Myclass rr2 = new Myclass(19);

        System.out.println("Area: " + rr.display());
        System.out.println("Area: " + rr2.display());
        rr2.display();
    }
}
