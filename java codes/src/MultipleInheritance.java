interface A {
    public void num(int no);
}

interface B {
    public void numm(int noo);
}

class C implements A, B {
    // Corrected access modifier to public
    public void num(int no) {
        System.out.println("The num in interface A is: " + no);
    }

    public void numm(int noo) {
        System.out.println("The num in interface B is: " + noo);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        // Creating an object of class C
        C rr = new C();

        // Calling the implemented methods
        rr.num(199);
        rr.numm(1999);
    }
}
