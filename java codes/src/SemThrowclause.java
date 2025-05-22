class Throw {
    void vote (int age) {
        if (age<18) {
            throw new ArithmeticException("you are not eligible for voting");
        }
        else {
            System.out.println("you are elegible for voting");
        }
    }
}

public class SemThrowclause {
    public static void main (String[] args) {
        Throw obj = new Throw();
        obj.vote(17);
    }
    }
