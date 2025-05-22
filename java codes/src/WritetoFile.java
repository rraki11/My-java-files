import java.io.*;
import java.util.Scanner;

public class WritetoFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File f1 = new File("/home/rr/Documents/myfile.txt");
            System.out.println("Write something to write into file: ");
            String str = sc.nextLine();
            FileWriter fw = new FileWriter(f1);
            fw.write(str);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
