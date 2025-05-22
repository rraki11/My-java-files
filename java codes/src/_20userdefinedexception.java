
// Custom exception class (User-defined exception)
class InvalidAgeException extends Exception {
    // Constructor with a message
    public InvalidAgeException(String message) {
        super(message);  // Call the parent Exception class constructor
    }
}

public class _20userdefinedexception {
    // Method that throws the user-defined exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throwing the custom exception
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // This will trigger the exception
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

/*
* Explanation:

* Creating a Custom Exception (InvalidAgeException)
We extend the Exception class to create a checked exception.
The constructor calls super(message) to pass the error message.

* Using throw to Trigger the Exception
In checkAge(int age), we throw InvalidAgeException if age < 18.

* Handling the Exception with try-catch
checkAge(15); triggers the exception.
The catch block handles the exception and prints the error message.
*/