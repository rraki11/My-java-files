import java.io.IOException;

public class _19throwsclause {
    // This method declares that it might throw an IOException
    static void checkFile() throws IOException {
        throw new IOException("File not found!");  // Manually throwing an exception
    }

    public static void main(String[] args) {
        try {
            checkFile();  // Calling the method that may throw an exception
        }
        catch (IOException e) {
            System.out.println("\nException caught: " + e.getMessage());
        }
    }
}

/*
The throws clause is used in method signature/declarations to indicate that the method might throw one or more exceptions. It does not handle exceptions but propagates them to the caller.

* Explanation:

* Method Declaration with throws
The checkFile() method declares throws IOException, meaning it might throw an IOException.
Inside checkFile(), we manually throw an IOException using throw new IOException("File not found!").

* Handling the Exception in main
Since checkFile() does not handle the exception, main() must handle it
We call checkFile() inside a try-catch block.
If an exception occurs, it is caught and printed in the catch block.
*/