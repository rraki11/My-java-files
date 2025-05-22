class A {
    void show() {
        System.out.println("Hi method in C");
    }
}

class B extends A {

    @Override
    void show() {
        System.out.println("Hi method in B");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();

        a.show();
        b.show();
    }

}
