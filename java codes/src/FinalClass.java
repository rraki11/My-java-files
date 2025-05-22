final class a { // A final class cannot be extended (inherited) by other classes.
    void show() {
        System.out.println("HELLO WORLD");
    }
}

class b { // This is a regular class. It can be extended by other classes if needed.
    void print() {
        System.out.println("Hello world");
    }
}

public class FinalClass {
    public static void main(String[] args) {
        a rr1 = new a(); // Create an object of final class 'a'
        b rr2 = new b(); // Create an object of class 'b'

        rr1.show(); // Call the 'show' method of class 'a'
        rr2.print(); // Call the 'print' method of class 'b'
    }
}
