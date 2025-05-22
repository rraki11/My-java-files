class addsub {

    void add (int a, int b) {
        int res = a + b;
        System.out.println("sum is: " + res);
    }

    void sub (int a, int b) {
        int res = a - b;
        System.out.println("sub is: " + res);
    }
}

class muldiv extends addsub {

    void mul (int a, int b) {
        int res = a * b;
        System.out.println("mul is: " + res);
    }

    void div (float a, float b) {
        float res = a /b;
        System.out.println("div is: " + res);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        muldiv rr = new muldiv();

        rr.add(55, 55);
        rr.sub(500, 100);
        rr.mul(45,45);
        rr.div(200, 2);
    }
}
