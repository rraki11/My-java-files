class A {
    void methodA() {
        System.out.println("Method of class A");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Method of class B");
    }
}

class C extends A {
    void methodC() {
        System.out.println("Method of class C");
    }
}

class D extends A {
    void methodD() {
        System.out.println("Method of class D");
    }
}

public class HierarchicalInhertance {
    public static void main (String[] args) {
        B rr1 = new B();
        C rr2 = new C();
        D rr3 = new D();

        rr1.methodA();
        rr2.methodA();
        rr3.methodA();
    }
}
