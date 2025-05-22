import java.io.*;

public class ReadfromFile {
    public static void main(String[] args) {
        try {
            File f1 = new File("/home/rr/Documents/myfile.txt");
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String str;
            while ((str =  br.readLine()) != null) {
                System.out.println(str);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
