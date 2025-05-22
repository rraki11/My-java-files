// Class containing static methods for multiplication and division
class Main {
    // Static method to multiply two integers
    static int mul(int a, int b) {
        return (a * b); // Returns the product of a and b
    }

    // Static method to divide two floating-point numbers
    static float div(float a, float b) {
        return (a / b); // Returns the result of a divided by b
    }
}

// Main class to demonstrate the usage of static methods
public class StaticMethod {
    public static void main(String[] args) {

        //In Java, static methods belong to the class rather than to instances of the class. This means they can be called without creating an object of the class.

        //we can call a static method using "ClassName.methodName();"

        // Calling the static multiplication method and storing the result
        int a = Main.mul(7, 19);

        // Calling the static division method and storing the result
        float b = Main.div(19, 7);

        // Printing the results of multiplication and division
        System.out.println("a = " + a + " b = " + b);

    }
}
