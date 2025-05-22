class AgeException extends Exception {
    public AgeException (String s) {
        super(s);
    }
}

class Validage {
    public void validage(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("age is under 18 so not eligible for voting..");
        }
        else {
            System.out.println("valid age for voting..");
        }
    }
}

public class SemUserdefinedexception {
    public static void main(String[] args) {
        Validage obj = new Validage();
        try {
            obj.validage(19);
    }
    catch (AgeException e) {
        System.out.println(e + "exception occured");
    }
}
}
