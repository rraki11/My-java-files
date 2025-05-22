public class _18thorwclause {

    void checkage(int age) {
        if (age < 18) {
            throw new ArithmeticException("\n\nNot elegible for voting..!\n");
        }
        else {
            System.out.println("Oh, You are eligible for voting..!");
        }
    }

    public static  void main (String[] args) {
        _18thorwclause rr = new _18thorwclause();
        rr.checkage(17);
    }
}

/*
syntax:
throw new ExceptionType("Error message");

throw clause is used in the method body to throw an exception
*/
