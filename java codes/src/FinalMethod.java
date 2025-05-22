class finalmethod {

    //when a method is declared by using "final" keyword then it is said to be a final method. It cant be overriden.

    final void show(int a, int b) {
        System.out.println("Hello world");
        System.out.println(a + " " + b);
    }

    final void show(float a, float b) {
        System.out.println("Hello world");
        System.out.println(a + " " + b);
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        finalmethod rr = new finalmethod();
        rr.show(19,20);
        rr.show(19.9f,20.20f);
    }
}
