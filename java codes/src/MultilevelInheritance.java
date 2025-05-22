class A {
    public void dispa() {
        System.out.println("Method of Class A");
    }
}

class B extends A {
    public void dispb() {
        System.out.println("Method of Class B");
    }
}

class C extends B {
    public void dispc() {
        System.out.println("Method of Class C");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C rr = new C();

        rr.dispa();
        rr.dispb();
        rr.dispc();
    }
}
